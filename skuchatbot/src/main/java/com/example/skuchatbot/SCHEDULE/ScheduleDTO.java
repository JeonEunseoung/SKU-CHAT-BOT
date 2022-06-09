package com.example.skuchatbot.SCHEDULE;

public class ScheduleDTO {
    private int SCHEDULE_ID;
    private int H_ID;
    private String img_addr;

    public int getSCHEDULE_ID() {
        return SCHEDULE_ID;
    }

    public void setSCHEDULE_ID(int SCHEDULE_ID) {
        this.SCHEDULE_ID = SCHEDULE_ID;
    }

    public int getH_ID() {
        return H_ID;
    }

    public void setH_ID(int h_ID) {
        H_ID = h_ID;
    }

    public String getImg_addr() {
        return img_addr;
    }

    public void setImg_addr(String img_addr) {
        this.img_addr = img_addr;
    }
}
