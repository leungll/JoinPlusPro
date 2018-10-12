package com.pandawork.web.controller.entry;

import com.pandawork.common.entity.entry.Freshman;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.service.entry.FreshmanService;
import com.pandawork.web.spring.AbstractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/entry")
public class FreshmanController extends AbstractController {

    @Autowired
    FreshmanService freshmanService;

    @RequestMapping("/entry")
    public String toEntry(){
        return "outer/entry/entry";
    }

    @RequestMapping("/control")
    public String toControl(){
        return "manager/entry/entryControl";
    }

    @RequestMapping("/entryUpd")
    public String toEntryUpd(){
        return "outer/entry/entryUpd";
    }

    @RequestMapping("/listAll")
    public String listAllFreshman(Model model) {
        try {
            List<Freshman> freshmanList = Collections.emptyList();
            freshmanList = freshmanService.listAllFreshman();
            model.addAttribute("freshmanList", freshmanList);
            return "manager/entry/entryControl";
        } catch (SSException e) {
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }

//    @RequestMapping(value = "/addFreshman",method = RequestMethod.POST)
//    public String addFreshman(Freshman freshman,RedirectAttributes redirectAttributes){
//        try {
//            freshmanService.addFreshman(freshman);
//            redirectAttributes.addFlashAttribute("message", "添加成功！");
//            return "entry";
//        } catch (SSException e){
//            LogClerk.errLog.error(e);
//            sendErrMsg(e.getMessage());
//            return ADMIN_SYS_ERR_PAGE;
//        }
//    }

    @RequestMapping(value = "/addFreshman",method = RequestMethod.POST)
    public String addFreshman(Freshman freshman, RedirectAttributes redirectAttributes, HttpSession session, MultipartFile uploadFile, Model model) throws Exception{
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
        String date1=sdf.format(date);

        String filename = date1 + uploadFile.getOriginalFilename();
        String leftPath = session.getServletContext().getRealPath("images");
        File file = new File(leftPath,filename);
        freshman.setPhoto("/images/"+filename);
        try {
            uploadFile.transferTo(file);
            freshmanService.addFreshman(freshman);
            String yon = new String();
            if(freshman.getYon() == 1){
                yon = "是";
            }else if(freshman.getYon() == 0){
                yon = "否";
            }
            model.addAttribute("yon",yon);
            model.addAttribute("Freshman",freshman);
            model.addAttribute("myId",freshmanService.getIdByNumber(freshman.getNumber()).getId());
            return "outer/entry/entryDownload";
        }
        catch (Exception e){
            System.out.println("文件保存出错");
            e.printStackTrace();
            String error = "此学号已报名，请检查填入学号是否正确，详情请联系管理员";
            redirectAttributes.addFlashAttribute("error",error);
            return "redirect:/entry/entry";
        }
//        redirectAttributes.addFlashAttribute("myId",freshmanService.getIdByNumber(freshman.getNumber()).getId());
//        return "redirect:/entry/entry";
    }

    @RequestMapping(value = "/deleteFreshman/{id}",method = RequestMethod.GET)
    public String deleteFreshman(@PathVariable("id") int id){
        try {
            freshmanService.deleteFreshman(id);
            return "redirect:/entry/listAll";
        } catch (SSException e) {
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }

    @RequestMapping("/searchById/{id}")
    public String searchById(Model model,@PathVariable("id") int id){
        try {
            model.addAttribute("freshman", freshmanService.getFreshman(id));
            String yon = new String();
            if(freshmanService.getFreshman(id).getYon() == 1){
                yon = "是";
            }else if(freshmanService.getFreshman(id).getYon() == 0){
                yon = "否";
            }
            model.addAttribute("yon",yon);
            return "manager/entry/entryInfo";
        } catch (SSException e ){
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }

    @RequestMapping("/getById/{id}")
    public String getById(Model model,@PathVariable("id") int id,@RequestParam("examine") String pass){
        try {
            Freshman f = new Freshman();
            f = freshmanService.getFreshman(id);
            f.setPass(pass);
            freshmanService.updateFreshman(f);
            return "redirect:/entry/listAll";
        } catch (SSException e ){
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }

    @RequestMapping("/searchVolunteer")
    public String searchVolunteer(Model model,@RequestParam("volunteer") String dpm){
        try {
            List<Freshman> list = Collections.emptyList();
            List<Freshman> freshmanList = Collections.emptyList();
            freshmanList = freshmanService.searchVolunteer1(dpm);
            list = freshmanService.searchVolunteer2(dpm);
            freshmanList.addAll(list);
            model.addAttribute("freshmanList",freshmanList);
            return "manager/entry/entryControl";
        } catch (SSException e ){
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }

    @RequestMapping("/searchPass")
    public String searchPass(Model model,@RequestParam("pass") String pass){
        try {
            List<Freshman> freshmanList = Collections.emptyList();
            if(pass.equals("通过")){
                List<Freshman> list = Collections.emptyList();
                List<Freshman> list2 = Collections.emptyList();
                freshmanList = freshmanService.searchPass("前端");
                list = freshmanService.searchPass("后端");
                list2 = freshmanService.searchPass("产品");
                freshmanList.addAll(list);
                freshmanList.addAll(list2);
            }else{
                freshmanList = freshmanService.searchPass(pass);
            }
            model.addAttribute("freshmanList",freshmanList);
            return "manager/entry/entryControl";
        } catch (SSException e ){
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }

    @RequestMapping(value = "update")
    public String update(Freshman freshman,@RequestParam("id") int id,HttpSession session,MultipartFile uploadFile,Model model) {
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
        String date1=sdf.format(date);

        String filename = date1 + uploadFile.getOriginalFilename();
        String leftPath = session.getServletContext().getRealPath("images");
        File file = new File(leftPath,filename);
        freshman.setPhoto("/images/"+filename);
        freshman.setId(id);
        try {
            uploadFile.transferTo(file);
            freshmanService.updateFreshman(freshman);
            String yon = new String();
            if(freshman.getYon() == 1){
                yon = "是";
            }else if(freshman.getYon() == 0){
                yon = "否";
            }
            model.addAttribute("yon",yon);
            model.addAttribute("Freshman",freshman);
            model.addAttribute("myId",freshman.getId());
            return "outer/entry/entryDownload";
//            return "entry";
        }
        catch (Exception e){
            System.out.println("文件保存出错");
            e.printStackTrace();
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }
}

