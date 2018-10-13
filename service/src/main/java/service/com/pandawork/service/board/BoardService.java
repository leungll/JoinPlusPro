package com.pandawork.service.board;

import com.pandawork.common.entity.board.Board;
import com.pandawork.core.common.exception.SSException;

import java.util.List;

public interface BoardService {
    /**
     * 公告信息列表
     * @return
     * @throws SSException
     */
    public List<Board> listAll( ) throws SSException;
    /**
     * 增加公告信息
     * @throws SSException
     */
    public void newBoard(Board board) throws SSException;

    /**
     * 删除公告信息
     * @throws SSException
     */
    public boolean delById(int id) throws SSException;

    /**
     * 更新公告信息
     * @throws SSException
     */
    public void update(Board board) throws SSException;

    /**
     * 根据ID查询公告
     * @param id
     * @return
     * @throws Exception
     */
    public Board queryById(int id) throws SSException;

    /**
     * 根据关键字查询信息
     * @param keyword
     * @return
     * @throws SSException
     */
    public List<Board> queryByKeyword(String keyword) throws SSException;

    /**
     * 根据标题查找公告
     * @param title
     * @return
     * @throws Exception
     */
    public Board queryByTitle(String title) throws Exception;
}
