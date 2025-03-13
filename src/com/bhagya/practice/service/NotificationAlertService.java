package com.bhagya.practice.service;

import com.bhagya.practice.model.NotificationAlert;

import java.util.HashMap;
import java.util.Scanner;

public class NotificationAlertService {

    private HashMap<Integer, NotificationAlert> notificationAlerts = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    public void acceptNotificationAlertInfo(){
        NotificationAlert notificationAlert = new NotificationAlert();

        System.out.println("Enter Passenger ID: ");
        int Passengerid = Integer.parseInt(sc.nextLine());

        System.out.println("Enter Notification Message");
        String message = sc.nextLine();

        System.out.println("Enter Date and Time");
        String dateTime = sc.nextLine();

        notificationAlert.put(1,notificationAlert);
    }

    public void displayNotificationAlertInfo(){
        NotificationAlert notificationAlert = new NotificationAlert();
        System.out.println("Notification Details" + notificationAlert);
    }
}
