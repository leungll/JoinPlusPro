package com.pandawork.web.controller.project;

import com.pandawork.common.entity.answer.Answer2;
import com.pandawork.common.entity.project.Project;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.core.common.util.Assert;
import com.pandawork.service.answer.Answer2Service;
import com.pandawork.service.project.ProjectService;
import com.pandawork.web.spring.AbstractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Collections;
import java.util.List;

/**
 * @author : kongyy
 * @time : 2018/8/2 15:32
 */

@Controller
@RequestMapping("/project")
public class ProjectController extends AbstractController {
    @Autowired
    ProjectService projectService;

    @Autowired
    Answer2Service answer2Service;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String projectList(Model model) {
        try {
            List<Project> list = Collections.emptyList();
            list = projectService.listAllProject();
            List<Answer2> list2 = Collections.emptyList();
            list2 = answer2Service.listAllAnswer2();
            //此即为foreach循环的item
            model.addAttribute("projectList", list);
            model.addAttribute("answer2List", list2);
            return "inner/Konghome";
        } catch (SSException e) {
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }

    @RequestMapping(value = "/toAdd",method = RequestMethod.GET)
    public String toAddProject(Model model) {
        try {
            List<Project> list = Collections.emptyList();
            list = projectService.listAllProject();
            model.addAttribute("projectList", list);
            return "addKong";
        } catch (SSException e) {
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }

    @RequestMapping(value ="/add", method = RequestMethod.POST)
    public String addProject(Project project, RedirectAttributes redirectAttributes) {
        try {
            projectService.addProject(project);
            redirectAttributes.addFlashAttribute("message", "添加成功！");
            return "redirect:/project/list";
        } catch (SSException e){
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }

    @RequestMapping(value = "del/{id}", method = RequestMethod.GET)
    public String delProject(@PathVariable("id") int id) {
        try {
            projectService.delProject(id);
            //删除后还需重定向页面才可获取最新列表
            return "redirect:/project/list";
        } catch (SSException e) {
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }

    @RequestMapping(value = "/toUpdate/{id}",method = RequestMethod.GET)
    public String toUpdate(@PathVariable("id") int id , Model model){
        try{
            Project project = new Project();
            project = projectService.selectById(id);
            model.addAttribute("project",project);
            return "inner/Konghome";
        }catch(SSException e){
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String update(Project project , @RequestParam("id") int id, Model model){
        try{
            if(Assert.isNull(project)){
                return null;
            }
            project.setId(id);
            model.addAttribute("project",project);
            projectService.updateProject(project);
            return "redirect:/project/list";
        }catch(SSException e){
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }

    @RequestMapping(value = "/select",method = RequestMethod.POST)
    public String select(@RequestParam String keyword, Model model){
        try{
            List<Project> list = Collections.emptyList();
            list = projectService.select(keyword);
            model.addAttribute("list",list);
            return "select";
        }catch(SSException e){
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }

    @RequestMapping(value = "/update1",method = RequestMethod.GET)
    public String update1(Project project , @PathVariable("id")int id, Model model){
        try{
            if(Assert.isNull(project)){
                return null;
            }
            project.setId(id);
            model.addAttribute("project",project);
            projectService.updateProject(project);
            return "redirect:/project/list";
        }catch(SSException e){
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }
}

