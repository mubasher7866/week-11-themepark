package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int peopleInLine = 90;
        int peopleOnRide = 40;
        int time = 0;

        while (peopleInLine <= 600){
            peopleInLine -= peopleOnRide;
            peopleInLine+=63;
            time +=5;
        }
        System.out.println(time);
    }
}
