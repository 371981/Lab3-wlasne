package pl.lublin.wsei.java.cwiczenia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Main {

	// write your code here
        static Map<String, String> map = new HashMap<String, String>();

        public static void main(String[] args) {

            String csvFile = "C:\\Users\\SilentiumPC\\IdeaProjects\\Lab3-wlasne\\nobel_prize_by_winner.csv";
            String line = "";
            String cvsSplitBy = ",";

            try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

                while ((line = br.readLine()) != null) {

                    // przecinek jest separatorem
                    String[] country = line.split(cvsSplitBy);
                    for (int i = 0; i < country.length; i++) {
                        map.put(country[4], country[5]);
                    }

                }

            } catch (IOException e) {
                e.printStackTrace();
            }

            for (Map.Entry<String, String> entry : map.entrySet()) {
                String code = entry.getKey();
                String name = entry.getValue();
                String firstname= entry.getKey();
                String surname = entry.getValue();
                String year = entry.getKey();
                System.out.println("Imię i nazwisko: " + firstname +", "+ surname+ ", rok: "+ year);
                //System.out.println("Country [code= " + code + " , name=" + name + "]");
            }
        }

}

