package CS102_LAB7;
import java.util.*;
import java.io.*;

public class Main {
    public static Scanner kb= new Scanner(System.in);

    public static void main(String[] arg) throws IOException {
        String fileName="/Users/yusufcakir/IdeaProjects/Lab102CSJAVA/src/CS102_LAB7/Lab7_cars.txt";
        System.out.println("There are "+readLines(fileName).size()+" lines");
        printAL(readLines(fileName));
        System.out.print("Enter a mark: ");
        String brandName = kb.nextLine();
        findMarkprint(readLines(fileName),brandName);
        System.out.print("Enter max. kilometer : ");
        int km = kb.nextInt();
        findKmPrint(readLines(fileName),km);


    }
    public static ArrayList<String> readLines(String fileName)throws IOException {
        Scanner fileScan =new Scanner(new File(fileName));
        ArrayList<String> lines = new ArrayList<String>();
        while(fileScan.hasNextLine()){
            String line = fileScan.nextLine();
            lines.add(line);
        }
        fileScan.close();
        return lines;

    }
    public static void printAL(ArrayList<String> fileName){
        System.out.println("CARS:");
        for(String line: fileName){
            System.out.println(line);
        }
    }
    public static void findMarkprint(ArrayList<String> fileName,String brandName){
        ArrayList<String> filterCar = new ArrayList<String>();
        for(String line : fileName ){
            String[] parts =line.split(";");
            if(parts.length>1 && parts[1].trim().equalsIgnoreCase(brandName)){
                filterCar.add(line);
            }

        }
        System.out.println("\nCars of brand "+brandName+" ");
        printAL(filterCar);

    }
    public static void findKmPrint(ArrayList<String> fileName,int km){
        System.out.println("Searcing for with km less than or equal to "+km);
        ArrayList<String> kmList = new ArrayList<String>();
        for(String line : fileName){
            String[] parts = line.split(";");
            if(parts.length>5){
                int cars = Integer.parseInt(parts[5].trim());
                if (cars <= km){
                    kmList.add(line);
                }
            }
        }
        printAL(kmList);
    }

}
