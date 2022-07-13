package com.qst.risk.mapper;

import com.qst.risk.entity.Loans;

public interface LoansMapper {
    public String selectLoansByLoaNo(String loaNo);

    public void updateLoaMoney(Loans loans);
}
