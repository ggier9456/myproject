package com.kyle;

public class Tickets {
    int destination;
    int price;
    int man;

    public Tickets(int destination, int price, int man) {
        this.destination = destination;
        this.price = price;
        this.man = man;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMan() {
        return man;
    }

    public void setMan(int man) {
        this.man = man;
    }
}
