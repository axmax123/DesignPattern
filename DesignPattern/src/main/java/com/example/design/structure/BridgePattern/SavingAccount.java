package com.example.design.structure.BridgePattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SavingAccount implements Account{
    @Override
    public void creatAccount() {
        log.info("Saving Account");
    }
}
