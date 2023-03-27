package com.example.design.structure.BridgePattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SweddenBank extends Bank {
    public SweddenBank(Account account){
        super(account);
    }
    @Override
    public void openAccount() {
    log.info("Account Swedden is ");
    account.creatAccount();

    }
}
