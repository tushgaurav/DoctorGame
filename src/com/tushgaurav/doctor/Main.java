package com.tushgaurav.doctor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // main patient object
        Person patient = new Person("Tushar", 18,
                new Eye("Left Eye", "Myopia", "Blue", true),
                new Eye("Right Eye", "Myopia", "Blue", true),
                new Heart("Heart", "Normal", 65),
                new Stomach("Stomach", "Bloated", false),
                new Skin("Skin", "Blisters", "White", 8));

        // print details of patient
        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());

        // input and loop variables
        boolean quit = false;
        Scanner scanner = new Scanner(System.in);

        // main loop
        while (!quit) {
            System.out.println("Choose an organ:\n\t1. Left Eye\n\t2. Right Eye\n\t3. Heart" +
                    "\n\t4. Stomach\n\t5. Skin\n\t6. Quit");
            int choice = scanner.nextInt();

            switch (choice) {

                // left eye
                case 1:
                    patient.getLeftEye().getDetails();
                    if (patient.getLeftEye().isOpened()) {
                        System.out.println("\t\t1. Close the Eye");
                        if (scanner.nextInt() == 1) {
                            patient.getLeftEye().close();
                        } else {
                            continue;
                        }
                    } else {
                        System.out.println("\t\t1. Open the Eye");
                        if (scanner.nextInt() == 1) {
                            patient.getLeftEye().open();
                        } else {
                            continue;
                        }
                    }

                    break;

                // right eye
                case 2:
                    patient.getRightEye().getDetails();
                    if (patient.getRightEye().isOpened()) {
                        System.out.println("\t\t1. Close the Eye");
                        if (scanner.nextInt() == 1) {
                            patient.getRightEye().close();
                        } else {
                            continue;
                        }
                    } else {
                        System.out.println("\t\t1. Open the Eye");
                        if (scanner.nextInt() == 1) {
                            patient.getRightEye().open();
                        } else {
                            continue;
                        }
                    }

                    break;

                // heart
                case 3:
                    patient.getHeart().getDetails();
                    System.out.println("\t\t1. Change the heart rate");
                    if (scanner.nextInt() == 1) {
                        System.out.println("Enter new heart rate: ");
                        int newHeartRate = scanner.nextInt();
                        patient.getHeart().setRate(newHeartRate);
                        System.out.println("Heart rate changed to: " + patient.getHeart().getRate());
                    } else {
                        continue;
                    }
                    break;

                // stomach
                case 4:
                    patient.getStomach().getDetails();
                    System.out.println("\t\t1. Digest food");
                    if (scanner.nextInt() == 1) {
                        patient.getStomach().digest();
                    }
                    else {
                        continue;
                    }
                    break;

                // skin
                case 5:
                    patient.getSkin().getDetails();
                    System.out.println("\t\t1. Apply Mostoriser");
                    if (scanner.nextInt() == 1) {
                        patient.getSkin().applyMostoriser();
                    }
                    else {
                        continue;
                    }
                    break;

                // quit loop and exit
                case 6:
                    quit = true;

            }


        }
        return;
    }
}