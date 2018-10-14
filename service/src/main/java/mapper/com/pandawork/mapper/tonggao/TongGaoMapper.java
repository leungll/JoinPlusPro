package com.pandawork.mapper.tonggao;

import com.pandawork.common.entity.tonggao.TongGao;
import com.pandawork.common.entity.tonggao.TongGao;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TongGaoMapper {
    List<TongGao> GetAllTonggao();
    boolean addTongGao(@Param("tg") TongGao tongGao);
    TongGao downLoad(@Param("id") int id);
    boolean delTongGao(@Param("id") int id);
    List<TongGao> findTongGao(@Param("date") String date);
}
