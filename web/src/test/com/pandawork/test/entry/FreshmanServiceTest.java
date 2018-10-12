package com.pandawork.test.entry;

import com.pandawork.common.entity.entry.Freshman;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.service.entry.FreshmanService;
import com.pandawork.test.AbstractTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class FreshmanServiceTest extends AbstractTestCase {
    @Autowired
    FreshmanService freshmanService;

    //测试列出所有报名者
    @Test
    public void testListAllFreshman() throws SSException {
        System.out.print(freshmanService.listAllFreshman());
    }

    //测试添加报名者
    @Test
    public void testAddFreshman() throws SSException {
        Freshman fr = new Freshman();
        fr.setName("李昕");
        fr.setIntroduction("略略略");
        fr.setMajor("软件工程");
        fr.setNation("汉");
        fr.setNativePlace("江西");
        fr.setNumber(2017012510);
        fr.setPass("通过");
        fr.setPhone("13811079040");
        fr.setPhoto("");
        fr.setQq(92935004);
        fr.setRank(2);
        fr.setRankAll(110);
        fr.setReason("乐意");
        fr.setSex("女");
        fr.setVolunteer1("后端");
        fr.setVolunteer2("");
        fr.setYon(0);
        freshmanService.addFreshman(fr);
    }

    //测试删除报名者
    @Test
    public void testDeleteFreshman() throws SSException{
        int id = 4;
        System.out.println(freshmanService.deleteFreshman(id));
    }

    //测试修改报名者信息
    @Test
    public void testUpdateFreshman() throws SSException{
        Freshman fr = new Freshman();
        fr.setId(3);
        fr.setName("梁佳悦");
        fr.setIntroduction("嘻嘻嘻");
        fr.setMajor("软件工程");
        fr.setNation("汉");
        fr.setNativePlace("陕西");
        fr.setNumber(2017012546);
        fr.setPass("通过");
        fr.setPhone("15584418038");
        fr.setPhoto("");
        fr.setQq(799937565);
        fr.setRank(8);
        fr.setRankAll(110);
        fr.setReason("吼吼吼");
        fr.setSex("女");
        fr.setVolunteer1("后端技术部");
        fr.setVolunteer2("");
        fr.setYon(0);
        freshmanService.updateFreshman(fr);
    }

    @Test
    public void testSearchVolunteer1() throws SSException{
        String key1 = "后端";
        System.out.println(freshmanService.searchVolunteer1(key1));
    }

    @Test
    public void testSearchVolunteer2() throws SSException{
        String key2 = "前端";
        System.out.println(freshmanService.searchVolunteer2(key2));
    }

    @Test
    public void testSearchPass() throws SSException{
        String pass = "前端";
        System.out.println(freshmanService.searchPass(pass));
    }

    @Test
    public void testGetFreshman() throws SSException{
        int id = 1;
        System.out.println(freshmanService.getFreshman(id));
    }

    @Test
    public void testGetIdByNumber() throws SSException{
        int number = 2017011837;
        System.out.println(freshmanService.getIdByNumber(number));
    }
}


