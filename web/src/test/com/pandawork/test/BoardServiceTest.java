package com.pandawork.test;

import com.pandawork.common.entity.board.Board;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.service.board.BoardService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class BoardServiceTest extends AbstractTestCase {
    @Autowired
    BoardService boardService;
    @Test
    public void testListAll() throws SSException{
        System.out.println(boardService.listAll());
    }
    @Test
    public void testNewBoard() throws SSException{
        Board board=new Board();
        board.setContent("你好???");
        board.setYear(1999);
        board.setMonth(1);
        board.setDay(27);
        board.setState("1");
        board.setTitle("hhh");
        boardService.newBoard(board);
    }
    @Test
    public  void testDelById() throws SSException{

        boardService.delById(1);
    }
    @Test
    public void testUpdate() throws SSException{
        Board board=new Board();
        board.setId(2);
        board.setYear(2018);
        board.setMonth(9);
        board.setDay(9);
        board.setContent("感谢你");
        board.setState("1");
        boardService.update(board);
    }
    @Test
    public void testQueryByKeyword() throws SSException{
        String keyword="你";
        System.out.println(boardService.queryByKeyword(keyword));
    }
    @Test
    public  void testQueryById() throws SSException{
        Board board=boardService.queryById(2);
        System.out.println(board.toString());
    }
    @Test
    public  void  testQueryByTitle() throws Exception {
        Board board=boardService.queryByTitle("我");
        System.out.println(board.toString());
    }
}
