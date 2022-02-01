package no.uib.ii.inf112;

import org.junit.jupiter.api.Test;

public class FizzBuzz {
    public void game() {
        for (int i=1; i<=100; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fuzzbuzz");
                continue;
            }
            if (i % 3 == 0) {
                System.out.println("fizz");
                continue;
            }
            if (i % 5 == 0) {
                System.out.println("buzz");
                continue;
            }
            else System.out.println(i);
        }
    }


    @Test
    void testFizzBuzz() {

    }

    }