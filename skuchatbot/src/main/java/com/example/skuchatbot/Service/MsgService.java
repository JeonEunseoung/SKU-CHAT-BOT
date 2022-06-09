package com.example.skuchatbot.Service;

import com.example.skuchatbot.BURSARY.BursaryDAO;
import com.example.skuchatbot.BURSARY.BursaryDTO;
import com.example.skuchatbot.Hello.HelloDAO;
import com.example.skuchatbot.Hello.HelloDTO;
import com.example.skuchatbot.LMS.LmsDAO;
import com.example.skuchatbot.LMS.LmsDTO;
import com.example.skuchatbot.Mark.MarkDAO;
import com.example.skuchatbot.Mark.MarkDTO;
import com.example.skuchatbot.Notice.NoticeDAO;
import com.example.skuchatbot.Notice.NoticeDTO;
import com.example.skuchatbot.PHONE.PhoneDAO;
import com.example.skuchatbot.PHONE.PhoneDTO;
import com.example.skuchatbot.SCHEDULE.ScheduleDAO;
import com.example.skuchatbot.SCHEDULE.ScheduleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class MsgService {

    final
    HelloDAO helloDAO;

    final
    NoticeDAO noticeDAO;

    final
    ScheduleDAO scheduleDAO;

    final
    BursaryDAO bursaryDAO;

    final
    PhoneDAO phoneDAO;

    final
    MarkDAO markDAO;

    final
    LmsDAO lmsDAO;

    public MsgService(HelloDAO helloDAO, NoticeDAO noticeDAO, ScheduleDAO scheduleDAO, BursaryDAO bursaryDAO, PhoneDAO phoneDAO, MarkDAO markDAO, LmsDAO lmsDAO) {
        this.helloDAO = helloDAO;
        this.noticeDAO = noticeDAO;
        this.scheduleDAO = scheduleDAO;
        this.bursaryDAO = bursaryDAO;
        this.phoneDAO = phoneDAO;
        this.markDAO = markDAO;
        this.lmsDAO = lmsDAO;
    }


    public ModelAndView selectHelloAllList(Model model) throws Exception{
        List<HelloDTO> list = new ArrayList<>(); //환영메시지 리스트
        List<NoticeDTO> list2 = new ArrayList<>(); // 공지사항 리스트
        List<ScheduleDTO> list3 = new ArrayList<>(); // 학사일정리스트
        List<BursaryDTO> list4 = new ArrayList<>(); // 장학금리스트
        List<PhoneDTO> list5 = new ArrayList<>(); // 전화번호리스트
        List<MarkDTO> list6 = new ArrayList<>(); // 성적리스트
        List<LmsDTO> list7 = new ArrayList<>(); // LMS리스트

        HelloDTO helloDTO = new HelloDTO();
        NoticeDTO noticeDTO = new NoticeDTO();
        ScheduleDTO scheduleDTO = new ScheduleDTO();
        BursaryDTO bursaryDTO = new BursaryDTO();
        PhoneDTO phoneDTO = new PhoneDTO();
        MarkDTO markDTO = new MarkDTO();
        LmsDTO lmsDTO = new LmsDTO();

        try{
            list = helloDAO.HelloCheck(helloDTO);
            list2 = noticeDAO.AddrCheck(noticeDTO);
            list3 = scheduleDAO.ScheduleCheck(scheduleDTO);
            list4 = bursaryDAO.BursaryCheck(bursaryDTO);
            list5 = phoneDAO.PhoneCheck(phoneDTO);
            list6 = markDAO.MarkCheck(markDTO);
            list7 = lmsDAO.LmsCheck(lmsDTO);
            model.addAttribute("list", list); // 헬로 테이블
            model.addAttribute("list2", list2); // 공지사항 테이블
            model.addAttribute("list3", list3); // 학사일정 테이블
            model.addAttribute("list4", list4); // 학사일정 테이블
            model.addAttribute("list5", list5); // 전화번호 테이블
            model.addAttribute("list6", list6); // 전화번호 테이블
            model.addAttribute("list7", list7); // 전화번호 테이블
            System.out.println(list);
            System.out.println(list2);
            System.out.println(list3);
            System.out.println(list4);
            System.out.println(list5);
            System.out.println(list6);
            System.out.println(list7);
        }catch (SQLException e){
            e.printStackTrace();
        }

        return new ModelAndView("zzz");
    }
}

