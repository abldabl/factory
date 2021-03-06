package com.company.w9HW;

public class Main {
    public static void main(String[] args) {
          TransportFactory transportFactory=new TransportFactory();
          Transport transport1=transportFactory.getTransport("TRUCK");
          transport1.deliver();
          Transport transport2=transportFactory.getTransport("Ship");
          transport2.deliver();
    }
}
