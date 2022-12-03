package com.sda.richardagarici.advanced.coding.oop.ex6;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket(10);
        try {

            basket.addToBasket("eggs");
            basket.addToBasket("eggs");
            basket.addToBasket("eggs");
            basket.addToBasket("eggs");
            basket.addToBasket("eggs");
            basket.addToBasket("eggs");
            basket.addToBasket("eggs");
            basket.addToBasket("eggs");
            basket.addToBasket("eggs");
            basket.addToBasket("eggs");
            basket.addToBasket("eggs");
        } catch (BasketFullException e) {
            System.err.println(e.getMessage());
        }
        try {
            basket.removeFromBasket("eggs");
            basket.removeFromBasket("eggs");
            basket.removeFromBasket("eggs");
            basket.removeFromBasket("eggs");
            basket.removeFromBasket("eggs");
            basket.removeFromBasket("eggs");
            basket.removeFromBasket("eggs");
            basket.removeFromBasket("eggs");
            basket.removeFromBasket("eggs");
            basket.removeFromBasket("eggs");
            basket.removeFromBasket("eggs");
            basket.removeFromBasket("eggs");
            basket.removeFromBasket("eggs");
        } catch (BasketEmptyException e) {
            System.err.println(e.getMessage());
        }
    }
}