package com.qst.risk.entity;


public class Risk {

    private int risk_id;  //主键
    private String loa_no;  //贷款编号
    private String com_name;  //企业名称
    private Long loa_money;  //贷款金额
    private Long loa_lis_id;   //贷款周期
    private String apt_price;  //抵押物价值
    private Integer month_account_min;  //月流水最小值
    private String gross_liabilities;  //总负债值
    private String credit_line;   //额度值
    private String risk_del = "0";  //是否删除 0存在 2删除

    public int getRisk_id() {
        return risk_id;
    }

    public void setRisk_id(int risk_id) {
        this.risk_id = risk_id;
    }

    public String getLoa_no() {
        return loa_no;
    }

    public void setLoa_no(String loa_no) {
        this.loa_no = loa_no;
    }

    public String getCom_name() {
        return com_name;
    }

    public void setCom_name(String com_name) {
        this.com_name = com_name;
    }

    public Long getLoa_money() {
        return loa_money;
    }

    public void setLoa_money(Long loa_money) {
        this.loa_money = loa_money;
    }

    public Long getLoa_lis_id() {
        return loa_lis_id;
    }

    public void setLoa_lis_id(Long loa_lis_id) {
        this.loa_lis_id = loa_lis_id;
    }

    public String getApt_price() {
        return apt_price;
    }

    public void setApt_price(String apt_price) {
        this.apt_price = apt_price;
    }

    public Integer getMonth_account_min() {
        return month_account_min;
    }

    public void setMonth_account_min(Integer month_account_min) {
        this.month_account_min = month_account_min;
    }

    public String getGross_liabilities() {
        return gross_liabilities;
    }

    public void setGross_liabilities(String gross_liabilities) {
        this.gross_liabilities = gross_liabilities;
    }

    public String getCredit_line() {
        return credit_line;
    }

    public void setCredit_line(String credit_line) {
        this.credit_line = credit_line;
    }

    public String getRisk_del() {
        return risk_del;
    }

    public void setRisk_del(String risk_del) {
        this.risk_del = risk_del;
    }

    public Risk() {
    }

    public Risk(int risk_id, String credit_line) {
        this.risk_id = risk_id;
        this.credit_line = credit_line;
    }

    public Risk(int risk_id, String loa_no, String com_name, Long loa_money, Long loa_lis_id, String apt_price, Integer month_account_min, String gross_liabilities, String credit_line, String risk_del) {
        this.risk_id = risk_id;
        this.loa_no = loa_no;
        this.com_name = com_name;
        this.loa_money = loa_money;
        this.loa_lis_id = loa_lis_id;
        this.apt_price = apt_price;
        this.month_account_min = month_account_min;
        this.gross_liabilities = gross_liabilities;
        this.credit_line = credit_line;
        this.risk_del = risk_del;
    }


}
