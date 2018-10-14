package com.pandawork.service.tonggao;

import com.pandawork.common.entity.tonggao.TongGao;

import java.io.File;
import java.util.List;

public interface TongGaoService {
    List<TongGao> getAllTongGao();
    boolean addTongGao(TongGao tg);
    File downLoad(int id);
    void delTongGao(int id);
    List<TongGao> findTongGao(String date);
}
