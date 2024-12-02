package com.adventofcode.arturocandela.dos;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class RedNoseReports {

    String stringInputFile;

    public RedNoseReports(String inputFile){

        this.stringInputFile = inputFile;

    }

    public int countSafeReports() throws FileNotFoundException
    {
        File RedNoseReportsFile = new File(stringInputFile);

        int safeReports = 0;

        try (Scanner reportReader = new Scanner(new FileInputStream(RedNoseReportsFile))){

            

            while(reportReader.hasNextLine()){

                if (reportIsSafe(reportReader.nextLine())){
                    safeReports++;
                }
                

            }


        } 

        return safeReports;

    }

    public boolean reportIsSafe(String lineReport){


        try (Scanner readLevels = new Scanner(lineReport)){

            readLevels.useDelimiter(" ");

            ArrayList<Integer> levelsList = new ArrayList<Integer>();
    
            while(readLevels.hasNextInt()){
    
                levelsList.add(readLevels.nextInt());
    
            }

            int levels[] = new int[levelsList.size()];
            
            int i = 0;

            for (Integer level : levelsList) {
                
                levels[i++] = level;

            }

            boolean decrease = levels[0] > levels[1];

            for (int j = 0; j< levels.length - 1; j++){

                if ( decrease != levels[j] > levels[j+1]){
                    return false;
                }

                if (  levels[j] == levels[j+1]){
                    return false;
                }

                if ( !(3 >= Math.abs(levels[j] - levels[j+1]))){
                    return false;
                }

            }
        }

        return true;
    }

    
}
