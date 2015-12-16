package ru.vychmaty;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Main {


    static double f(double... set){

        double sum = 0;
        for(double d : set){
            sum = sum + d;
        }
        return sum;

    }

    public static void main(String args[]){

        File input = new File("D:\\Progay\\IDEA Workspace\\Vychmaty-3\\src\\ru\\vychmaty\\test.txt");

        try {
            Scanner scanner = new Scanner(input);

            int pointsNumber = scanner.nextInt();
            int dimensionSize = scanner.nextInt();
            double leftBorder = scanner.nextDouble();
            double rightBorder = scanner.nextDouble();

            double set[] = new double[dimensionSize];
            double result = 0;
            Random random = new Random();

            for (int i = 0; i < pointsNumber; ++i) {

                for(int j = 0; j < dimensionSize; ++j) {
                    set[j] = random.nextDouble()*(rightBorder - leftBorder) + leftBorder;
                }
                result = result + f(set);
            }

            result = result * Math.pow(rightBorder - leftBorder, dimensionSize) / pointsNumber;

            System.out.println(result);
            scanner.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}

