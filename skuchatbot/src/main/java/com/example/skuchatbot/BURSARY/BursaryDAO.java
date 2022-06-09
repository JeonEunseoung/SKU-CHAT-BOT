package com.example.skuchatbot.BURSARY;

import com.example.skuchatbot.BURSARY.BursaryDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BursaryDAO {
    public List<BursaryDTO> BursaryCheck(BursaryDTO bursaryDTO) throws Exception;
}
