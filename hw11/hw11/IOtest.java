package hw11;

import taxi.garage.CargoCars;
import taxi.garage.Cars;
import taxi.garage.Minivan;
import taxi.interfaces.Car;

import java.io.*;


public class IOtest {
    public static String[] cars(File data) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(data);
        byte[] readBytes = new byte[fis.available()];
        fis.read(readBytes);
        String file = new String(readBytes);
        String[] fieldCar;
        fieldCar = file.split(";\r\n");
        fis.close();
        return fieldCar;
    }

    public static void writeToFile(Car[] cars) throws IOException {
        File reData = new File("C:\\Users\\ntt\\IdeaProjects\\IOTest\\src\\HW10\\reData.txt");
        FileOutputStream fos = new FileOutputStream(reData, false);
        try {
            for (Car result : cars) {
                fos.write(result.writeToFile());

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static Car[] increaseArray(Car[] x) {
        Car[] carz = new Car[x.length + 1];
        for (int i = 0; i < x.length; i++) {
            carz[i] = x[i];
        }
        return carz;
    }

    public static void main(String[] args) throws IOException {
        File data = new File("C:\\Users\\ntt\\IdeaProjects\\IOTest\\src\\HW10\\dataRead.txt");
        String[] bFF = cars(data);

        Car[] cars = new Car[0];

        for (String j : bFF) {
            String[] fields = j.split(",");
//

            if (j.endsWith("Cars")) {
                cars = increaseArray(cars);
                cars[cars.length - 1] = new Cars(fields[0], fields[1], Integer.parseInt(fields[2]), Integer.parseInt(fields[3]),
                        Integer.parseInt(fields[4]), fields[5]);

            } else if (j.endsWith("Cargo")) {

                cars = increaseArray(cars);
                cars[cars.length - 1] = new CargoCars(fields[0], fields[1], Integer.parseInt(fields[2]), Integer.parseInt(fields[3]),
                        Integer.parseInt(fields[4]), fields[5]);

            } else if (j.endsWith("Minivan")) {

                cars = increaseArray(cars);
                cars[cars.length - 1] = new Minivan(fields[0], fields[1], Integer.parseInt(fields[2]), Integer.parseInt(fields[3]),
                        Integer.parseInt(fields[4]), fields[5]);
            }
        }
//        for (Car d : cars) {
//            System.out.println(d.toString());
//
//        }
        writeToFile(cars);

    }

}


