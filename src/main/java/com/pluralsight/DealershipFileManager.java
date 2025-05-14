package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DealershipFileManager {
    public Dealership getDealership() {

        try {
            FileReader fileReader = new FileReader("data/inventory.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
            catch   (IOException e){
                System.out.println("An errorr occurred while reading the file." );
                e.printStackTrace


        }
        }

        Dealership dealership = new Dealership("", "", "");
            return dealership;
    }
    public void saveDealership(Dealership dealership){

    }

}
