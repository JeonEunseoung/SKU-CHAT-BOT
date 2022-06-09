package com.example.skuchatbot.Hello;

import lombok.Data;

@Data
public class HelloDTO {
    private int MENU_ID;
    private String NAME;
    private String msg;

    public int getMENU_ID() {
        return MENU_ID;
    }

    public void setMENU_ID(int MENU_ID) {
        this.MENU_ID = MENU_ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
