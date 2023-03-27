package com.example.design.structure.BridgePattern;

public class BridgeMain {
    public static void main(String[] args) {
        Bank chainhausBank = new ChainHausBank(new CheckingAccount());
        chainhausBank.openAccount();

        Bank sweddenBank = new SweddenBank(new SavingAccount());
        sweddenBank.openAccount();
    }
}
