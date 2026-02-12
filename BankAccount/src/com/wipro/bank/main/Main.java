package com.wipro.bank.main;

import com.wipro.bank.bean.TransferBean;
import com.wipro.bank.service.BankService;

public class Main {

    public static void main(String[] args) {

        BankService bankService = new BankService();

        System.out.println(bankService.checkBalance("A101"));

        TransferBean transferBean = new TransferBean();
        transferBean.setFromAccountNumber("A101");
        transferBean.setToAccountNumber("A104");
        transferBean.setAmount(100);
        transferBean.setDateOfTransaction(new java.util.Date());

        System.out.println(bankService.transfer(transferBean));
    }
}