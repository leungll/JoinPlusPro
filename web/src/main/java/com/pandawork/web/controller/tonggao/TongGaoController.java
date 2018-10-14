package com.pandawork.web.controller.tonggao;

import com.pandawork.common.entity.tonggao.TongGao;
import com.pandawork.service.tonggao.TongGaoService;
import com.pandawork.web.spring.AbstractController;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.List;

@Controller
@RequestMapping("/TongGao")
public class TongGaoController extends AbstractController {
    @Autowired
    TongGaoService tonggaoService;
    @RequestMapping("/getall")
    public String listAll(Model model, HttpServletRequest req){
        List<TongGao> list = null;
        list = tonggaoService.getAllTongGao();
        model.addAttribute("list",list);
        System.out.println(req.getAttribute("power"));
        System.out.println(list);
        return "/inner/Konghome";
    }
    @RequestMapping("/getall1")
    public String listAll1(Model model, HttpServletRequest req){
        List<TongGao> list = null;
        list = tonggaoService.getAllTongGao();
        model.addAttribute("list",list);
        System.out.println(req.getAttribute("power"));
        return "manager/tonggao/tonggao";
    }

    @RequestMapping("/add")
    public String add(MultipartFile uploadFile, Model model, HttpSession session) throws Exception {
        String filename = uploadFile.getOriginalFilename();
        String leftPath = session.getServletContext().getRealPath("file");
        File file = new File(leftPath,filename);
        TongGao tongGao = new TongGao();
        tongGao.setTitle(filename);
        tongGao.setFile(filename);
        Calendar now = Calendar.getInstance();
        tongGao.setDate(String.valueOf(now.get(Calendar.DAY_OF_MONTH)));
        tongGao.setDateshow(String.valueOf(now.get(Calendar.YEAR))+String.valueOf(now.get(Calendar.MONTH))+String.valueOf(now.get(Calendar.DAY_OF_MONTH)));
        tonggaoService.addTongGao(tongGao);
        uploadFile.transferTo(file);
        return "redirect:/TongGao/getall";
    }

    @RequestMapping("/downLoad")
    public ResponseEntity<byte[]> downLoad(String filename, HttpServletRequest req) throws Exception {
        //获取绝对路径
        String path =req.getServletContext().getRealPath("/file/");
        HttpHeaders headers = new HttpHeaders();
        //引用指向文件
        File file = new File(path+File.separator+filename);
        //下载显示的文件名，解决中文名称乱码问题
        String downloadFielName = new String(filename.getBytes("UTF-8"),"iso-8859-1");
        //通知浏览器以attachment（下载方式）打开文件
        headers.setContentDispositionFormData("attachment", downloadFielName);
        //application/octet-stream ： 二进制流数据（最常见的文件下载）。
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.CREATED);
    }

    @RequestMapping("/findTongGao")
    public void findTongGaoByName(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("ajax交互成功,其中date数据为"+req.getParameter("date"));
        String date = req.getParameter("date");
        List<TongGao> list = tonggaoService.findTongGao(date);
        TongGao tg = null;
        System.out.println(1);
        for( int i = 0 ; i<list.size();i++){
            System.out.println("进入for循环");
            tg = list.get(i);
        }
        System.out.println("退出for循环");
        String tgtitle = tg.getTitle();
        PrintWriter out = resp.getWriter();
        out.write(tgtitle);
        System.out.println("通告题目为："+tgtitle);
    }

    @RequestMapping("/delTongGao")
    public String delTongGao(int id){
        tonggaoService.delTongGao(id);
        return "redirect:/TongGao/getall1";
    }

    @RequestMapping("/inner")
    public String inner(){
        return "/inner/Konghome";
    }
}
