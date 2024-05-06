package CS102_LAB8;
import java.util.*;
import java.io.*;



public class Main {
    public static void main(String[] arg)throws IOException{
        ArrayList<Person> persons = new ArrayList<>();

        readPersons("/Users/yusufcakir/IdeaProjects/Lab102CSJAVA/src/CS102_LAB8/CS102_Lab8.txt", persons);
        System.out.println("Number of persons: " + persons.size());
        printPersons(persons);
        System.out.println("Oldest persons:");
        int oldestCount = printOldest(persons);
        System.out.println("Number of oldest persons: " + oldestCount);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a birth year: ");
        int year = scanner.nextInt();
        printByBirthYear(persons, year);

        scanner.close();




    }
    public static void readPersons(String fileName, ArrayList<Person> persons) throws IOException {
        int count = 0;
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                count ++;
                String line = scanner.nextLine();
                String[] parts = line.split(";");
                if (parts.length == 6) {
                    String id = parts[0];
                    String firstName = parts[1];
                    String lastName = parts[2];
                    char gender = parts[3].charAt(0);
                    int birthYear = Integer.parseInt(parts[4]);
                    String profession = parts[5];
                    Person person = new Person(id, firstName, lastName, gender, birthYear, profession);
                    persons.add(person);
                }
            }
        }
    }
    public static void printPersons(ArrayList<Person> persons) {
        System.out.println("PERSONS: ");
        for (Person person : persons) {
            System.out.println(person);
        }
    }
    public static int printOldest(ArrayList<Person> persons) {
        // Find the minimum birth year in the ArrayList
        int minBirthYear = Integer.MAX_VALUE;
        for (Person person : persons) {
            if (person.getBirthyear()< minBirthYear) {
                minBirthYear = person.getBirthyear();
            }
        }

        // Print the oldest persons and count them
        int count = 0;
        for (Person person : persons) {
            if (person.getBirthyear() == minBirthYear) {
                System.out.println(person);
                count++;
            }
        }

        return count;
    }
    public static void printByBirthYear(ArrayList<Person> persons, int year) {
        int count = 0;
        System.out.println("Persons born in " + year + ":");
        for (Person person : persons) {
            if (person.getBirthyear() == year) {
                System.out.println(person);
                count++;
            }
        }
        System.out.println("Number of persons born in " + year + ": " + count);
    }


}
