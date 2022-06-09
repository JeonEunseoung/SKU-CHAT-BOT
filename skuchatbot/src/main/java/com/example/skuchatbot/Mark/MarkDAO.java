package com.example.skuchatbot.Mark;

import com.example.skuchatbot.Mark.MarkDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MarkDAO {
    public List<MarkDTO> MarkCheck(MarkDTO markDTO) throws Exception;
}
