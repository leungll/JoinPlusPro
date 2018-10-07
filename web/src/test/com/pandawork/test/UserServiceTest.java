//package com.pandawork.test;
//
//import com.pandawork.common.entity.User;
//import com.pandawork.mapper.UserMapper;
//import com.pandawork.service.UserService;
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.io.InputStream;
//import java.util.List;
//
//public class UserServiceTest {
//    @Autowired
//    UserService userService;
//
//    //遍历user
//    @Test
//    public void testListAll() throws Exception{
//        InputStream in = null;
//        List<User> list = null;
//        UserMapper userMapper = null;
//        //加载Mybatis配置文件
//        try {
//            in = Resources.getResourceAsStream("Test-mybatis.xml");
//            //根据相关的mybatis配置文件， 创建连接SQLSessionFactory连接对象
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
//            //创建出SQLSession对象
//            SqlSession sqlSeesion = factory.openSession();
//            //通过sqlSession取到映射接口
//            userMapper = sqlSeesion.getMapper(UserMapper.class);
//            list = userMapper.listAll();
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//
//        System.out.print(list);
//    }
//}
