package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] array = new int[]{4, 2, 1, 3, 5};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("po sortowaniu");
        selectionSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        int[] array2 = new int[100];
        for (int i = 0; i < 100; i++) {
            array2[i] = (int) (Math.random() * 100 + 1);
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("po sortowaniu");

        selectionSort(array2);
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("========================");
        System.out.println("Sorting Persons");

        Person p1 = new Person("Józek", 21);
        Person p2 = new Person("Franek", 34);
        Person p3 = new Person("Jacek", 29);
        Person p4 = new Person ("Jacek", 10);
        Person p5 = new Person ("Adam", 34);
        Person p6 = new Person("Adaś", 34);
        Person[] persons = new Person[]{p1, p2, p3, p4,p5, p6};

        selectionSort(persons);
        System.out.println("should be : Jacek, Jozek , Jacek 29, Franek");
        for (Person per : persons) {
            System.out.println(per.getName() + " " + per.getAge());
        }
    }


    public static int[] selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length - 1; j++) {
                if (array[i] > array[j + 1])
                    swap(array, i, j + 1);
            }

        }


        return array;
    }

    public static int[] swap(int[] array, int p, int r) {
        int temp = array[p];
        array[p] = array[r];
        array[r] = temp;

        return array;
    }

    public static Person[] selectionSort(Person[] persons) {
        for (int i = 0; i < persons.length; i++) {
            for (int j = i; j < persons.length - 1; j++) {
                if (persons[i].getAge() > persons[j + 1].getAge()) {
                    swap(persons, i, j + 1);
                }
                if (persons[i].getAge() == persons[j + 1].getAge()) {
                    if(!isHigherInAlphabet(persons[i].getName(),persons[j+1].getName())){
                        swap(persons, i, j+1);
                    }
                }
            }
        }

        return persons;
    }
//checks alphabetical order of two Strings and returns true if first is higher
    public static boolean isHigherInAlphabet(String first, String second) {
        if(first.compareTo(second)<0){
            return true;
        }else return false;

    }

    public static Person[] swap(Person[] persons, int p, int r) {
        Person temp = persons[p];
        persons[p] = persons[r];
        persons[r] = temp;

        return persons;
    }
}
