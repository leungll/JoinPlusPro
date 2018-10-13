package com.pandawork.mapper.board;

import com.pandawork.common.entity.board.Board;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface BoardMapper {
    /**
     * 列出所有的公告信息
     */
    public List<Board> listAll() throws Exception;
    /**
     * 增加公告信息
     * @param board
     */
    public void newBoard(@Param("board") Board board) throws Exception;
    /**
     * 删除公告信息
     */
    public boolean delById(@Param("id")int id) throws Exception;
    /**
     * 修改公告信息
     */
    public void update(@Param("board")Board board)throws Exception;
    /**
     * 通过关键字查找公告信息
     */
    public List<Board> queryByKeyword(@Param("keyword")String keyword)throws Exception;
    /**
     * 通过id查找公告信息
     */
    public Board queryById(@Param("id")int id)throws Exception;

    /**
     * 通过标题查找公告
     * @param title
     * @return
     * @throws Exception
     */
    public Board queryByTitle(@Param("title")String title) throws Exception;
}
