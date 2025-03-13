package com.bhagya.practice.service;

import com.bhagya.practice.model.Passenger;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PassengerService {

    static HashMap<Integer, Passenger> passengerHashMap = new HashMap<Integer, Passenger>();
    public static final Scanner scanner = new Scanner(System.in);
    int passengerIndex = 0;




    public static Passenger registerPassenger(){

        Passenger passenger = new Passenger();
        System.out.println(" Pls Enter Your Full Name");
        String FullName = scanner.nextLine();

        System.out.println("Pls Enter Your Contact No");
        long MoNo = scanner.nextLong();

        System.out.println("Pls Enter Your UID No");
        long uidNo = scanner.nextLong();

        passenger.put(1,passenger);
        return passenger;
    }

    public static void displayPassenger(){

        Set<Map.Entry<Integer , Passenger>> entrySet = passengerHashMap.entrySet();
        for(Map.Entry<Integer , Passenger> passengerEntry: entrySet){
            System.out.println("key: " + passengerEntry.getKey() + "value: " + passengerEntry);

        }
    }
}
