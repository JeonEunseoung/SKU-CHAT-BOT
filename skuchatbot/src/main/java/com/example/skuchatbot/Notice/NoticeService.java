package com.example.skuchatbot.Notice;

import com.example.skuchatbot.Controller.NoticeDAO;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class NoticeService {
    final
    NoticeDAO noticeDAO;

    public NoticeService(NoticeDAO noticeDAO) {
        this.noticeDAO = noticeDAO;
    }


    public ModelAndView selectNoticeAllList(Model model) throws Exception{
        List<NoticeDTO> list = new ArrayList<>();
        NoticeDTO noticeDTO = new NoticeDTO();
        try{
            list = noticeDAO.AddrCheck(noticeDTO);
            model.addAttribute("list", list);
        }catch (SQLException e){
            e.printStackTrace();
        }

        return new ModelAndView("noticeList");
    }
}
