package com.pandawork.web.controller.activity;


import com.pandawork.common.entity.activity.Activity;
import com.pandawork.common.entity.board.Board;
import com.pandawork.common.entity.beauty.Beauty;
import com.pandawork.common.entity.lunbo.Lunbo;
import com.pandawork.service.activity.ActivityService;
import com.pandawork.service.board.BoardService;
import com.pandawork.service.BeautyService;
import com.pandawork.service.LunboService;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
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
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/activity")
public class ActivityController extends AbstractController {
    @Autowired
    ActivityService activityService;

    @Autowired
    BoardService boardService;

    @Autowired
    BeautyService beautyService;

    @Autowired
    LunboService lunboService;
    @RequestMapping(value = "/list")
    public String activityList(Model model) {
        try {
            List<Activity> list = Collections.emptyList();
            list = activityService.listAll();
            model.addAttribute("activityList", list);//此即为foreach循环的item
            System.out.println(list);
            return "manager/activity/activityList";
        } catch (SSException e) {
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }
    @RequestMapping(value="/list2")
    public String AllList(Model model){
        try{
            List<Activity> list1 = Collections.emptyList();
            list1 = activityService.listAll();
            model.addAttribute("activityList", list1);//此即为foreach循环的item

            List<Board> list2=Collections.emptyList();
            list2=boardService.listAll();
            model.addAttribute("boardList",list2);

            List<Beauty>list3=Collections.emptyList();
            list3=beautyService.listAllBeauty();
            model.addAttribute("beautyList2",list3);

            List<Lunbo>list4=Collections.emptyList();
            list4=lunboService.listAllLunbo();
            model.addAttribute("lunboList2",list4);
            return "outer/home/home";
        }catch (SSException e) {
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }

    @RequestMapping(value = "/toHome", method = RequestMethod.GET)
    public String toHomePage() {
        return "outer/home/home";
    }
    @RequestMapping(value = "/toActivitymore", method = RequestMethod.GET)
    public String toActivitymore(Model model) {
        try{
            List<Activity> list = Collections.emptyList();
            list = activityService.listAll();

            model.addAttribute("activityList", list);//此即为foreach循环的item
            return "outer/more/activitymore";
        }catch (SSException e) {
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }
    @RequestMapping(value = "/toBoardmore", method = RequestMethod.GET)
    public String toNewActivity1(Model model) {
        try {
            List<Board> list = Collections.emptyList();
            list = boardService.listAll();
            model.addAttribute("boardList", list);//此即为foreach循环的item
            return "outer/more/boardmore";
        }catch (SSException e) {
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }
    @RequestMapping(value="/toAdd",method = RequestMethod.GET)
    public String toAdd(){return "manager/activity/activityadd";}
    @RequestMapping(value="/edit",method = RequestMethod.GET)
    public String toUpdate(){return "manager/activity/activityupdate";}
    @RequestMapping("/add")
    public String addActivity(@RequestParam("state")String state, Activity activity, HttpSession session, MultipartFile uploadFile1, MultipartFile uploadFile2,MultipartFile uploadFile3,Model model) throws SSException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
        String date1 = sdf.format(date);

        String filename1 = date1+uploadFile1.getOriginalFilename();
        String filename2 = date1+uploadFile2.getOriginalFilename();
        String filename3 = date1+uploadFile3.getOriginalFilename();
        String leftPath = session.getServletContext().getRealPath("images");

        File file1 = new File(leftPath, filename1);
        File file2 = new File(leftPath, filename2);
        File file3 = new File(leftPath, filename3);


        activity.setImage1("/images/" + filename1);
        activity.setImage2("/images/" + filename2);
        activity.setImage3("/images/" + filename3);
        try {
            String stt = new String();
            System.out.println(state);
            if(state.equals("1")){
                stt = "yes";
            }else if (state.equals("0")){
                stt = "no";
            }else{
                stt = "不是0和1";
            }
            activity.setState(stt);
            uploadFile1.transferTo(file1);
            uploadFile2.transferTo(file2);
            uploadFile3.transferTo(file3);
        } catch (Exception e) {
            System.out.println("文件保存出错");
            e.printStackTrace();
        }
        activityService.newActivity(activity);
        model.addAttribute("image1", activity.getImage1());
        model.addAttribute("image2", activity.getImage2());
        model.addAttribute("image3", activity.getImage3());
        return "redirect:/activity/list";
    }
    @RequestMapping(value="/update/{id}", method = RequestMethod.POST)
    public String updateActivity(@RequestParam("state")String state,@PathVariable("id") int id,Activity activity, HttpSession session, MultipartFile uploadFile1,MultipartFile uploadFile2,MultipartFile uploadFile3, Model model) throws SSException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
        String date1 = sdf.format(date);

        String filename1 = date1+uploadFile1.getOriginalFilename();
        String filename2 = date1+uploadFile2.getOriginalFilename();
        String filename3 = date1+uploadFile3.getOriginalFilename();
        String leftPath = session.getServletContext().getRealPath("images");
        File file1 = new File(leftPath,filename1);
        File file2 = new File(leftPath,filename2);
        File file3 = new File(leftPath,filename3);
        activity.setImage1("/images/"+filename1);
        activity.setImage2("/images/"+filename2);
        activity.setImage3("/images/"+filename3);
        try {
            String stt = new String();
            System.out.println(state);
            if(state.equals("1")){
                stt = "yes";
            }else if (state.equals("0")){
                stt = "no";
            }else{
                stt = "不是0和1";
            }
            activity.setState(stt);
            uploadFile1.transferTo(file1);
            uploadFile2.transferTo(file2);
            uploadFile3.transferTo(file3);
        }
        catch (Exception e){
            System.out.println("文件保存出错");
            e.printStackTrace();
        }
        activityService.update(activity);
        model.addAttribute("image1",activity.getImage1());
        model.addAttribute("image2",activity.getImage2());
        model.addAttribute("image3",activity.getImage3());
        return "redirect:/activity/list";
    }
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String toNewActivity(@PathVariable("id") int id,Model model,Activity activity){
        try{
            activity=activityService.queryById(id);
            model.addAttribute("activity",activity);
            return "manager/activity/activityupdate";
        }catch(SSException e){
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable("id") int id) {
        try {
            activityService.delById(id);
            return "redirect:/activity/list";//删除后还需重定向页面才可获取最新列表
        } catch (SSException e) {
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }

}
