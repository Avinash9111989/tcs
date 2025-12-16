package com.solid.ISP;

class BurgerOrderServiceClass implements BurgerOrderService {
    @Override
    public void orderBurger(int quantity) {
        System.out.println("Received order of "+quantity+" burgers");
    }

  
}
