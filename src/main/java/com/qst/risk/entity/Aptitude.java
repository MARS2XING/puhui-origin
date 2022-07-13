package com.qst.risk.entity;

public class Aptitude {
    private int apt_id;
    private int com_id;
    private int apt_loa_id;
    private String apt_credit;
    private String apt_pawn;
    private String apt_loans_record;
    private String apt_com_value;
    private String apt_del;

    public Aptitude() {
    }

    public Aptitude(int apt_loa_id, String apt_credit) {
        this.apt_loa_id = apt_loa_id;
        this.apt_credit = apt_credit;
    }

    @Override
    public String toString() {
        return "Aptitude{" +
                "apt_id=" + apt_id +
                ", com_id=" + com_id +
                ", apt_loa_id=" + apt_loa_id +
                ", apt_credit='" + apt_credit + '\'' +
                ", apt_pawn='" + apt_pawn + '\'' +
                ", apt_loans_record='" + apt_loans_record + '\'' +
                ", apt_com_value='" + apt_com_value + '\'' +
                ", apt_del='" + apt_del + '\'' +
                '}';
    }

    public int getApt_id() {
        return apt_id;
    }

    public void setApt_id(int apt_id) {
        this.apt_id = apt_id;
    }

    public int getCom_id() {
        return com_id;
    }

    public void setCom_id(int com_id) {
        this.com_id = com_id;
    }

    public int getApt_loa_id() {
        return apt_loa_id;
    }

    public void setApt_loa_id(int apt_loa_id) {
        this.apt_loa_id = apt_loa_id;
    }

    public String getApt_credit() {
        return apt_credit;
    }

    public void setApt_credit(String apt_credit) {
        this.apt_credit = apt_credit;
    }

    public String getApt_pawn() {
        return apt_pawn;
    }

    public void setApt_pawn(String apt_pawn) {
        this.apt_pawn = apt_pawn;
    }

    public String getApt_loans_record() {
        return apt_loans_record;
    }

    public void setApt_loans_record(String apt_loans_record) {
        this.apt_loans_record = apt_loans_record;
    }

    public String getApt_com_value() {
        return apt_com_value;
    }

    public void setApt_com_value(String apt_com_value) {
        this.apt_com_value = apt_com_value;
    }

    public String getApt_del() {
        return apt_del;
    }

    public void setApt_del(String apt_del) {
        this.apt_del = apt_del;
    }
}
