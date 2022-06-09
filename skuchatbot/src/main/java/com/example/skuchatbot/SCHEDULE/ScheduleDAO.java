package com.example.skuchatbot.SCHEDULE;

import com.example.skuchatbot.SCHEDULE.ScheduleDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ScheduleDAO {
    public List<ScheduleDTO> ScheduleCheck(ScheduleDTO ScheduleDTO) throws Exception;
}
