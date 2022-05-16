package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Statek statek = new Statek();
        statek.setRodzaj("Statek pasażerski");
        statek.Plyn();

        Samolot plane = new Samolot();
        plane.setRodzaj("Bombowiec");
        plane.Lec();

    }
}
