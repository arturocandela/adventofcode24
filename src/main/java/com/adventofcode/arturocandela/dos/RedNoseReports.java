package com.adventofcode.arturocandela.dos;

import java.util.ArrayList;
import java.util.Scanner;

public class RedNoseReports {

    String stringInputFile;

    public RedNoseReports(String inputFile){

        this.stringInputFile = inputFile;

    }

    public String result checkReport(String lineReport){

        

        Scanner reportMeassure = new Scanner(lineReport);

        reportMeassure.useDelimiter(" ");

        ArrayList<Integer> meassures = new ArrayList<Integer>();

        while(reportMeassure.hasNextInt()){

            meassures.add(reportMeassure.nextInt());

        }

    }

    
}
