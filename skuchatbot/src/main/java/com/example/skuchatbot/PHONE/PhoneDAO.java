package com.example.skuchatbot.PHONE;

import com.example.skuchatbot.PHONE.PhoneDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PhoneDAO {
    public List<PhoneDTO> PhoneCheck(PhoneDTO phoneDTO) throws Exception;
}
