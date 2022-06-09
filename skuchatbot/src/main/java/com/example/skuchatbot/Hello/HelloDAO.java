package com.example.skuchatbot.Hello;

import com.example.skuchatbot.Hello.HelloDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HelloDAO {
    public List<HelloDTO> HelloCheck(HelloDTO noticeDTO) throws Exception;
}
