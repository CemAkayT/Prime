package com.company;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) {
        System.out.println("This program tells you all the ");
        System.out.println("prime numbers up to a given maximum");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a maximum number!");
        int max = scanner.nextInt();

        List<Integer> primes = sieve(max);

        System.out.println("Prime numbers up to " + max);
        System.out.println(primes);
    }

    public static List<Integer> sieve(int max)
    {
        List<Integer> primes = new LinkedList<>();

        List<Integer> numbers = new LinkedList<>(); // add all numbers from 2 to max to the list

        for (int i = 2; i <=max ; i++)
        {
            numbers.add(i);
        }

        while (!numbers.isEmpty())
        {
            int front = numbers.remove(0); // remove a prime number from the front of the list
            primes.add(front);

            Iterator<Integer> iterator = numbers.iterator();

            while (iterator.hasNext())
            {
                int current = iterator.next();
                if (current % front == 0)
                {
                    iterator.remove(); // remove all multiples of this prime number
                }
            }
        } return primes;
    }
}
