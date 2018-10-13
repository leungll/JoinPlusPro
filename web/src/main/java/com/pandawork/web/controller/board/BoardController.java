package com.pandawork.web.controller.board;


import com.pandawork.common.entity.activity.Activity;
import com.pandawork.common.entity.board.Board;
import com.pandawork.common.entity.lunbo.Lunbo;
import com.pandawork.common.entity.beauty.Beauty;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.service.BeautyService;
import com.pandawork.service.LunboService;
import com.pandawork.web.spring.AbstractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.pandawork.service.board.BoardService;
import com.pandawork.service.activity.ActivityService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController extends AbstractController {
    @Autowired
    BoardService boardService;
    @Autowired
    ActivityService activityService;
    @Autowired
    BeautyService beautyService;
    @Autowired
    LunboService lunboService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String boardList(Model model) {
        try {

            List<Board> list = Collections.emptyList();
            list = boardService.listAll();
            model.addAttribute("boardList", list);//此即为foreach循环的item
            return "manager/board/boardList";

        } catch (SSException e) {
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }

    @RequestMapping(value = "/list1/{title}", method = RequestMethod.GET)
    public String boardList1(Model model, @PathVariable("title") String title) {
        try {
            System.out.println(title);
            Board board = new Board();
            board = boardService.queryByTitle(title);

            model.addAttribute("board", board);
            System.out.println(model);
            return "outer/clickboard/board";

        } catch (Exception e) {
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }





    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String toNewBoard(){
        return "manager/board/boardadd";
    }

    @RequestMapping(value ="/new", method = RequestMethod.POST)
    public String newBoard(@RequestParam("state")String state,Board board, RedirectAttributes redirectAttributes,Model model) {
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
            board.setState(stt);
            boardService.newBoard(board);
            model.addAttribute("board",board);
            redirectAttributes.addFlashAttribute("message", "添加成功！");
            return "redirect:/board/list";
        } catch (SSException e){
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }

    @RequestMapping(value = "/edit/{id}",method = RequestMethod.GET)
    public String edit(@PathVariable("id") int id,Model model){
        try{
            Board board=new Board();
            board=boardService.queryById(id);
            model.addAttribute("board",board);
            return "manager/board/boardupdate";
        }catch(SSException e){
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }

    }

    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    public String updateNews(@RequestParam("state")String state,Board board,@PathVariable("id")int id, Model model){
        try{
            String stt = new String();
            System.out.println(state);
            if(state.equals("1")){
                stt = "yes";
            }else if (state.equals("0")){
                stt = "no";
            }else{
                stt = "不是0和1";
            }
            board.setState(stt);
            boardService.update(board);
            return "redirect:/board/list";
        }catch(SSException e){
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }


    @RequestMapping(value ="/query",method = RequestMethod.GET)
    public String queryBoard(@RequestParam("keyword") String keyword,Model model) {
        try {
            List<Activity> list1 = Collections.emptyList();
            list1 = activityService.listAll();
            model.addAttribute("activityList", list1);//此即为foreach循环的item
            System.out.println("new"+list1);

            List<Board> list2 = Collections.emptyList();
            list2 = boardService.queryByKeyword(keyword);
            model.addAttribute("boardList",list2);
            System.out.println(list2);
            List<Beauty>list3=Collections.emptyList();
            list3=beautyService.listAllBeauty();
            model.addAttribute("beautyList2",list3);

            List<Lunbo>list4=Collections.emptyList();
            list4=lunboService.listAllLunbo();
            model.addAttribute("lunboList2",list4);
            return "outer/home/home";
        } catch (SSException e ){
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }


    @RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable("id") int id) {
        try {
            boardService.delById(id);
            return "redirect:/board/list";//删除后还需重定向页面才可获取最新列表
        } catch (SSException e) {
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }
}
