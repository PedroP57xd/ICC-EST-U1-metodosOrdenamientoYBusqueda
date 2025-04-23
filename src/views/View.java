package views;

import java.util.Scanner;
import models.Person;

public class View {
    Scanner scanner = new Scanner(System.in);

    public int showMenu() {
        System.out.println("1. Input persons");
        System.out.println("2. Add persons");
        System.out.println("3. Sort persons");
        System.out.println("4. Search persons");
        System.out.println("5. Exit");
        System.out.print("Select an option: ");
        return scanner.nextInt();
    }

    public Person person() {
        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        return new Person(name, age);
    }

    public int selectSortingMethod() {
        System.out.println("1. Sort by name (Bubble Sort)");
        System.out.println("2. Sort by name (Selection Sort Descending)");
        System.out.println("3. Sort by age (Insertion Sort)");
        System.out.println("4. Sort by name (Insertion Sort)");
        System.out.print("Select sorting method: ");
        return scanner.nextInt();
    }

    public int selectSerchCriterion() {
        System.out.println("1. Search by name");
        System.out.println("2. Search by age");
        System.out.print("Select search criterion: ");
        return scanner.nextInt();
    }

    public void displayPersons(Person[]){
        System.out.println("Persons list: ");
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    public void displaySerchResults() {
        System.out.println("Search results: ");
        Person[] persons;
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    public int inputAge() {
        System.out.print("Enter age to search: ");
        return scanner.nextInt();
    }

    public String inputName() {
        System.out.print("Enter name to search: ");
        return scanner.next();
    }

}
