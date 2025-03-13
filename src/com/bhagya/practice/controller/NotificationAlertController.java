package com.bhagya.practice.controller;

import com.bhagya.practice.service.NotificationAlertService;

import java.util.Scanner;

public class NotificationAlertController {

    private NotificationAlertService notificationAlertService = new NotificationAlertService();
    private Scanner scannner = new Scanner(System.in);

    public void handleNotificationOperation(){
        int option;
        do{
            System.out.println("Enter your option");
            System.out.println(".......Notification Managemant.....");
            System.out.println("1. Send Notification");
            System.out.println("2. view Notification");
            System.out.println("0. Back to main menu");

            option = Integer.parseInt(scannner.nextLine());

            switch (option){
                case 1:
                    notificationAlertService.acceptNotificationAlertInfo();
                    break;
                case 2:
                    notificationAlertService.displayNotificationAlertInfo();
                    break;
                default:
                    System.out.println("Invalid option");

            }
        }while (option != 0);

    }
}
