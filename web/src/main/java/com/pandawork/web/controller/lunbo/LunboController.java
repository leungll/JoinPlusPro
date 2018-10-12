package com.pandawork.web.controller.lunbo;

import com.pandawork.common.entity.lunbo.Lunbo;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.service.LunboService;
import com.pandawork.web.spring.AbstractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.Collections;
import java.util.List;

/**
 * @Author:liangll
 * @Description:
 * @Date: 17:00 2018/8/3
 */
@Controller
@RequestMapping("/lunbo")
public class LunboController extends AbstractController {

    @Autowired
    LunboService lunboService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String lunboList(Model model) {
        try {
            List<Lunbo> list = Collections.emptyList();
            list = lunboService.listAllLunbo();
            //此即为foreach循环的item
            model.addAttribute("lunboList", list);
            return "manager/lunbo/home_lunbo";
        } catch (SSException e) {
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }

    @RequestMapping(value = "/list2", method = RequestMethod.GET)
    public String lunboList2(Model model) {
        try {
            List<Lunbo> list = Collections.emptyList();
            list = lunboService.listAllLunbo();
            //此即为foreach循环的item
            model.addAttribute("lunboList2", list);
            return "TestHomeLLL";
        } catch (SSException e) {
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }

    @RequestMapping("/add")
    public String addLunbo(Lunbo lunbo, HttpSession session, MultipartFile uploadFile, Model model) throws SSException {
        String filename = uploadFile.getOriginalFilename();
        String leftPath = session.getServletContext().getRealPath("images");
        File file = new File(leftPath,filename);
        lunbo.setPath("/images/" + filename);
        try {
            uploadFile.transferTo(file);
        } catch (Exception e){
            System.out.println("文件保存出错");
            e.printStackTrace();
        }
        lunboService.addLunbo(lunbo);
//        model.addAttribute("lunbo.getPath()",lunbo.getPath());
        return "redirect:/lunbo/list";
    }

    @RequestMapping(value = "del/{id}", method = RequestMethod.GET)
    public String delLunbo(@PathVariable("id") int id) {
        try {
            lunboService.delLunbo(id);
            //删除后还需重定向页面才可获取最新列表
            return "redirect:/lunbo/list";
        } catch (SSException e) {
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }

    @RequestMapping(value = "/toUpdate/{id}",method = RequestMethod.GET)
    public String toUpdate(@PathVariable("id") int id , Model model){
        try{
            Lunbo lunbo = new Lunbo();
            lunbo = lunboService.selectById(id);
            model.addAttribute("lunbo",lunbo);
            return "manager/lunbo/update_lunbo";
        }catch(SSException e){
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }

    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    public String update(Lunbo lunbo , @PathVariable("id")int id, Model model, @RequestParam("status") String status){
        try{
            lunbo.setId(id);
            String stt = new String();
            System.out.println(status);
            if(status.equals("1")){
                stt = "Yes";
            }else if (status.equals("0")){
                stt = "No";
            }else{
                stt = "不是0和1";
            }
            lunbo.setId(id);
            lunbo.setStatus(stt);
            model.addAttribute("lunbo",lunbo);
            lunboService.updateLunbo(lunbo);
            return "redirect:/lunbo/list";
        }catch(SSException e){
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }
    @RequestMapping(value = "/update2/{id}",method = RequestMethod.POST)
    public String update2(Lunbo lunbo , @PathVariable("id")int id, Model model, @RequestParam("status") String status){
        try{
            lunbo.setId(id);
            String stt = new String();
            System.out.println(status);
            if(status.equals("1")){
                stt = "Yes";
            }else if (status.equals("0")){
                stt = "No";
            }else{
                stt = "不是0和1";
            }
            lunbo.setId(id);
            lunbo.setStatus(stt);
            model.addAttribute("lunbo",lunbo);
            lunboService.updateLunbo(lunbo);
            return "redirect:/lunbo/list";
        }catch(SSException e){
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }
}
