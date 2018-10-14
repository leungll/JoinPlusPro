package com.pandawork.web.controller.answer;

import com.pandawork.common.entity.answer.Answer1;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.core.common.util.Assert;
import com.pandawork.service.answer.Answer1Service;
import com.pandawork.web.spring.AbstractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.script.ScriptContext;
import java.util.Collections;
import java.util.List;

/**
 * @author : kongyy
 * @time : 2018/8/3 11:00
 */

@Controller
@RequestMapping("/answer1")
public class Answer1Controller extends AbstractController {

    ScriptContext response;

    @Autowired
    Answer1Service answer1Service;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String answer1List(Model model) {
        try {
            List<Answer1> list = Collections.emptyList();
            list = answer1Service.listAllAnswer1();
            model.addAttribute("answer1List", list);
            //此即为foreach循环的item
            return "testjsp";
        } catch (SSException e) {
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }

    @RequestMapping(value = "del/{id}", method = RequestMethod.GET)
    public String delAnswer2(@PathVariable("id") int id) {
        try {
            answer1Service.delAnswer1(id);
            return "redirect:/answer1/list";
            //删除后还需重定向页面才可获取最新列表
        } catch (SSException e) {
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }

    @RequestMapping(value = "/toAdd",method = RequestMethod.GET)
    public String toAddAnswer1(Model model){
        return "addKong";
    }

    @RequestMapping(value ="/add/{id}", method = RequestMethod.POST)
    public String addAnswer1(Answer1 answer1, RedirectAttributes redirectAttributes){
        try {
            answer1Service.addAnswer1(answer1);
            redirectAttributes.addFlashAttribute("message", "添加成功！");
            return "redirect:/answer1/list";
        } catch (SSException e){
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }

    @RequestMapping(value = "/toUpdate/{id}", method = RequestMethod.GET)
    public String toUpdateAnswer1(@PathVariable("id") int id, Model model){
        try{
            Answer1 answer1 ;
            answer1 = answer1Service.selectById(id);
            model.addAttribute("answer1", answer1);
            return "update";
        }catch (SSException e){
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public String updateAnswer1(Answer1 answer1, @PathVariable("id") int id , Model model) {
        try {
            if(Assert.isNull(answer1)){
                return null;
            }
            answer1.setId(id);
            model.addAttribute("answer1",answer1);
            answer1Service.updateAnswer1(answer1);
            return "redirect:/answer1/list";
        } catch (SSException e){
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }

    @RequestMapping(value ="/select",method = RequestMethod.POST)
    public String selectAnswer1(@RequestParam("keyword") String keyword, Model model) {
        try {
            List<Answer1> list = Collections.emptyList();
            list = answer1Service.select(keyword);
            model.addAttribute("list", list);
            return "select";
        } catch (SSException e ){
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }

//    @RequestMapping(value="/model",method=RequestMethod.GET)
//    public String personInfo1(Model model, HttpSession httpSession, HttpServletRequest request){
//        String personList = "返回字符串";
//        httpSession.setAttribute("nickname","Frank");
//        HttpSession session = request.getSession();
//        session.setAttribute("age","14");
//        model.addAttribute("name",personList);
//        return "personList";
//    }
//
//    public HttpSession getSession() {
//        HttpSession session = null;
//        try {
//            session = getRequest().getSession();
//        } catch (Exception e) {}
//        return session;
//    }

}
