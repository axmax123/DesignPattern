package com.example.design.structure.facadepattern;

public class FacadeMain {
    public static void main(String[] args) {
        ShopFacade.getInstance().buyProductByCashWithFreeShipping("axmax129@gmail.com");
        ShopFacade.getInstance().buyProductByPaypalWithStandardShipping("axmax129@gmail.com", "123456789");
    }
}
