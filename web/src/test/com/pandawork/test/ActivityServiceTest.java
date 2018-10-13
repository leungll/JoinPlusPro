package com.pandawork.test;

import com.pandawork.common.entity.activity.Activity;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.service.activity.ActivityService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ActivityServiceTest  extends  AbstractTestCase{
    @Autowired
    ActivityService activityService;
    @Test
    public void testListAll() throws SSException{
        System.out.println(activityService.listAll());

    }
    @Test
    public void testNewActivity() throws SSException{
        Activity activity=new Activity();
        activity.setContent("233");
        activity.setImage1("111");
        activity.setImage2("222");
        activity.setImage3("333");
        activity.setTitle("688");
        activity.setState("1");
        activityService.newActivity(activity);
    }
    @Test
    public  void testDelById() throws SSException{

        activityService.delById(17);
    }
    @Test
    public void testUpdate() throws SSException{
        Activity activity=new Activity();
        activity.setId(18);
        activity.setTitle("哈");
        activity.setImage1("0");
        activity.setImage2("1");
        activity.setImage3("2");
        activity.setContent("6");
        activityService.update(activity);

    }
    @Test
    public  void testQueryById() throws SSException{
        Activity activity=activityService.queryById(18);
        System.out.println(activity.toString());
    }

}
