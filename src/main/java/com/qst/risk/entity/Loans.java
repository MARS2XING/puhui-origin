package com.qst.risk.entity;

import java.util.Date;

public class Loans{
    private int loa_id;
    private String loa_no;
    private String loa_com_no;
    private Long loa_bank_id;
    private Long loa_lis_id;
    private String loa_use;
    private String loa_integral;
    private String loa_rate;
    private String loa_state;
    private Date loa_time;
    private Long loa_money;
    private Date loa_end_time;
    private String loa_del;

    public Loans() {
    }

    public Loans(int loa_id, Long loa_money) {
        this.loa_id = loa_id;
        this.loa_money = loa_money;
    }

    @Override
    public String toString() {
        return "Loans{" +
                "loa_id=" + loa_id +
                ", loa_no='" + loa_no + '\'' +
                ", loa_com_no='" + loa_com_no + '\'' +
                ", loa_bank_id=" + loa_bank_id +
                ", loa_lis_id=" + loa_lis_id +
                ", loa_use='" + loa_use + '\'' +
                ", loa_integral='" + loa_integral + '\'' +
                ", loa_rate='" + loa_rate + '\'' +
                ", loa_state='" + loa_state + '\'' +
                ", loa_time=" + loa_time +
                ", loa_money=" + loa_money +
                ", loa_end_time=" + loa_end_time +
                ", loa_del='" + loa_del + '\'' +
                '}';
    }

    public int getLoa_id() {
        return loa_id;
    }

    public void setLoa_id(int loa_id) {
        this.loa_id = loa_id;
    }

    public String getLoa_no() {
        return loa_no;
    }

    public void setLoa_no(String loa_no) {
        this.loa_no = loa_no;
    }

    public String getLoa_com_no() {
        return loa_com_no;
    }

    public void setLoa_com_no(String loa_com_no) {
        this.loa_com_no = loa_com_no;
    }

    public Long getLoa_bank_id() {
        return loa_bank_id;
    }

    public void setLoa_bank_id(Long loa_bank_id) {
        this.loa_bank_id = loa_bank_id;
    }

    public Long getLoa_lis_id() {
        return loa_lis_id;
    }

    public void setLoa_lis_id(Long loa_lis_id) {
        this.loa_lis_id = loa_lis_id;
    }

    public String getLoa_use() {
        return loa_use;
    }

    public void setLoa_use(String loa_use) {
        this.loa_use = loa_use;
    }

    public String getLoa_integral() {
        return loa_integral;
    }

    public void setLoa_integral(String loa_integral) {
        this.loa_integral = loa_integral;
    }

    public String getLoa_rate() {
        return loa_rate;
    }

    public void setLoa_rate(String loa_rate) {
        this.loa_rate = loa_rate;
    }

    public String getLoa_state() {
        return loa_state;
    }

    public void setLoa_state(String loa_state) {
        this.loa_state = loa_state;
    }

    public Date getLoa_time() {
        return loa_time;
    }

    public void setLoa_time(Date loa_time) {
        this.loa_time = loa_time;
    }

    public Long getLoa_money() {
        return loa_money;
    }

    public void setLoa_money(Long loa_money) {
        this.loa_money = loa_money;
    }

    public Date getLoa_end_time() {
        return loa_end_time;
    }

    public void setLoa_end_time(Date loa_end_time) {
        this.loa_end_time = loa_end_time;
    }

    public String getLoa_del() {
        return loa_del;
    }

    public void setLoa_del(String loa_del) {
        this.loa_del = loa_del;
    }
}
