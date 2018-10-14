package com.pandawork.service.tonggao.impl;

import com.pandawork.common.entity.tonggao.TongGao;
import com.pandawork.common.entity.tonggao.TongGao;
import com.pandawork.mapper.tonggao.TongGaoMapper;
import com.pandawork.mapper.tonggao.TongGaoMapper;
import com.pandawork.service.tonggao.TongGaoService;
import com.pandawork.service.tonggao.TongGaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

@Service("tonggaoService")
public class TongGaoServiceImpl implements TongGaoService {

    @Autowired
    TongGaoMapper tonggaoMapper;
    @Override
    public List<TongGao> getAllTongGao() {
        List<TongGao> list = tonggaoMapper.GetAllTonggao();
        return list;
    }

    @Override
    public boolean addTongGao(TongGao tg) {
        tonggaoMapper.addTongGao(tg);
        return false;
    }

    public File downLoad(int id){
        TongGao tg = tonggaoMapper.downLoad(id);

        return null;
    }

    @Override
    public void delTongGao(int id) {
         tonggaoMapper.delTongGao(id);
    }

    @Override
    public List<TongGao> findTongGao(String date) {
        List<TongGao> list = tonggaoMapper.findTongGao(date);
        return list;
    }
}
