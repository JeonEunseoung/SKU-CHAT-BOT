package com.example.skuchatbot.LMS;

import com.example.skuchatbot.LMS.LmsDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LmsDAO {
    public List<LmsDTO> LmsCheck(LmsDTO lmsDTO) throws Exception;
}
