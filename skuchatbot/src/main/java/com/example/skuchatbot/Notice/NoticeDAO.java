package com.example.skuchatbot.Notice;

import org.apache.ibatis.annotations.Mapper;
import com.example.skuchatbot.Notice.NoticeDTO;
import java.util.List;

@Mapper
public interface NoticeDAO {
    public List<NoticeDTO> AddrCheck(NoticeDTO noticeDTO) throws Exception;
}
