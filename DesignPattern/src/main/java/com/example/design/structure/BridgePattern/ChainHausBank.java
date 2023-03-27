package com.example.design.structure.BridgePattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ChainHausBank extends Bank{
    public ChainHausBank(Account account){
        super(account);

    }
    @Override
    public void openAccount() {
        log.info("Account ChainHaus is");
        account.creatAccount();
    }
}
