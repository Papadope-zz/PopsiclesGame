package popsiclesgame;

import java.util.Scanner;

public class PopsiclesGame {

    public static void main(String[] args) {
        eatOrGive();
    }

    public static void eatOrGive() {
        int numberOfSiblings = 0;
        int popsicles = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Give number of siblings and number of popsicles :");
        numberOfSiblings = sc.nextInt();
        popsicles = sc.nextInt();
        if (popsicles >= numberOfSiblings && (popsicles % numberOfSiblings == 0)) {
            System.out.println("give away");
        }
        
        else {
            System.out.println("eat them yourself");
        }

    }
}
