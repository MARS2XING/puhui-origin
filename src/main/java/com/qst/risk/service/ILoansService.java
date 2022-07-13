package com.qst.risk.service;

import com.qst.risk.entity.Loans;

public interface ILoansService {
    public int selectLoansByLoaNo(String loaNo);

    public void updateLoaMoney(Loans loans);
}
