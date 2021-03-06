package com.company.w9HW;

public class TransportFactory {
    public Transport getTransport(String type){
        if (type==null){
            return null;
        }
         if (type.equalsIgnoreCase("TRUCK")){
            return new Truck();
        }
        else if (type.equalsIgnoreCase("SHIP")){
            return new Ship();
         }
            return null;

    }
}
