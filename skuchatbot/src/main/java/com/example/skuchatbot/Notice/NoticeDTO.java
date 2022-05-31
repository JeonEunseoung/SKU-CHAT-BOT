package com.example.skuchatbot.Notice;


import lombok.Data;

//공지사항 테이블
@Data
public class NoticeDTO {
    private int NOTICE_ID;
    private int H_ID;
    private String NAME;
    private String addr;

    public int getNOTICE_ID() {
        return NOTICE_ID;
    }

    public void setNOTICE_ID(int NOTICE_ID) {
        this.NOTICE_ID = NOTICE_ID;
    }

    public int getH_ID() {
        return H_ID;
    }

    public void setH_ID(int h_ID) {
        H_ID = h_ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
