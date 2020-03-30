package com.hillel;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utills {


    public static File getFileFromResources() {
        String fileName = "Test.txt";
        ClassLoader classLoader = Utills.class.getClassLoader();

        URL resource = classLoader.getResource(fileName);
        if (resource == null) {
            throw new IllegalArgumentException("file is not found!");
        } else {
            return new File(resource.getFile());
        }

    }

    public static String[] temporarry() throws IOException {
        if (getFileFromResources() == null) return null;

        try (FileReader reader = new FileReader(getFileFromResources());
             BufferedReader br = new BufferedReader(reader)) {

            String line;
            while ((line = br.readLine()) != null) {
                 return line.replaceAll("[\\p{P}]", "").split(" ");
            }
        }
        return null;
    }


    public static String sortString(String inputDigit) {
        String[] tempArray = inputDigit.split(", ");
        Integer[] intValues = new Integer[tempArray.length];
        for (int i = 0; i < tempArray.length; i++) {
            intValues[i] = Integer.parseInt(tempArray[i].trim());
        }
        Arrays.sort(intValues);

        List<Integer> res = new ArrayList<>(Arrays.asList(intValues));
        return res.toString();
    }

    static String countWords(String word) throws IOException {

        int number = 0;
        for (String str : temporarry()) {
            if(str.equals(word)){
                number++;
            }
        }
        return String.valueOf(number);
    }



}
