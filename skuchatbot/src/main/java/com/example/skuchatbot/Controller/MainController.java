package com.example.skuchatbot.Controller;

import com.example.skuchatbot.Notice.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @Autowired
    NoticeService noticeService;
    @RequestMapping("/main")
    public String main(){
        return "hello";
    }

    @RequestMapping("/zzz")
    public ModelAndView main2(Model model) throws Exception {return noticeService.selectNoticeAllList(model);}
}
