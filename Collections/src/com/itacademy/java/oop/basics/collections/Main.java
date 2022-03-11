package com.itacademy.java.oop.basics.collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Task 1
//        String[] cars = {"Subaru", "BMW", "Suzuki"};
//        System.out.println("Second item is " + cars[1]);
//
//
//        for (int i = 0; i < cars.length; i++) {
//            if (cars[i].equals("Suzuki")) {
//                cars[i] = "Honda";
//            }
//        }
//
//        for (String car : cars) {
//            System.out.println(car);
//        }

        // Task 2
        // Task 3

//        int[] numbers = {40, 55, 63, 17, 22, 68, 89, 97, 89};
//        System.out.println("Output");
//        for (int number : numbers) {
//
//            System.out.print(" " + number);
//        }
//        System.out.println("");
//        List<Integer> list = new ArrayList<>();
//        for (int number : numbers) {
//            list.add(number);
//        }
//        System.out.println("");
//
//        for (Integer number : list) {
//            System.out.print(" " + number);
//        }

        // Task 4
//        List<Student> list = new ArrayList<>();
//        list.add(new Student("Jonas", 15));
//        list.add(new Student("Petras", 22));
//        list.add(new Student("Algis", 56));
//        list.add(new Student("Antanas", 16));
//        list.add(new Student("Virgis", 52));
//
//        for (int i = 0; i < list.size(); i++) {
//               if (list.get(i).getAge() > 25) {
//                list.remove(i);
//                i--;
//            }
//        }
//
//        for (Student student : list) {
//            System.out.println(student.toString());
//        }

//        Task 4
//        List<String> fruitsList = Arrays.asList("Apple", "Pear", "Banana", "Apple", "Cherry", "Fig", "Orange", "Banana", "Apple");
//        for (String fruit : fruitsList) {
//            System.out.print("First: " + fruit);
//        }
//        System.out.println();
//        System.out.println("Size of ArrayList " + fruitsList.size());
//
//        Set<String> newFruitsList = new HashSet<>(fruitsList);
//        for (String fruit : newFruitsList) {
//            System.out.print("Second: " + fruit);
//        }
//        System.out.println();
//        System.out.println("Size of HashSet " + newFruitsList.size());
//
//        Set<String> new2FruitsList = new TreeSet<>(newFruitsList);
//        for (String fruit : new2FruitsList) {
//            System.out.print("Third: " + fruit);
//        }
//        System.out.println();
//        System.out.println("Size of HashSet " + new2FruitsList.size());

//        Task 5

//        List<Student> list = new ArrayList<>();
//        Student s1 = new Student(111, "Jonas", 20, 5);
//        Student s2 = new Student(222, "Petras", 25, 6);
//        Student s3 = new Student(333, "Algis", 19, 4);
//        Student s4 = new Student(444, "Antanas", 22, 9);
//        list.add(s1);
//        list.add(s2);
//        list.add(s3);
//        list.add(s4);
//
//        Map<Integer, Student> mapList = new HashMap<>();
//        for (Student student : list) {
//            mapList.put(student.getId(), student);
//            System.out.println( student.getId() + " " + student);
//        }
//
//        System.out.println();
//        for (Map.Entry<Integer, Student> mapComponent : mapList.entrySet()) {
//            if (mapComponent.getKey() == 444) {
//                mapComponent.getValue().setGrade(2);
//            }
//        }
//
//        for (Map.Entry<Integer, Student> mapComponent : mapList.entrySet()) {
//            System.out.println(mapComponent.getKey() + " " + mapComponent.getValue());
//        }

        //        Task 6

//        int[] array = {5, 78, 19};
//
//        List<Integer> list = new ArrayList<>(Arrays.asList(5, 78, 19));
//    for (Integer element : list) {
//        System.out.println(element);
//    }
//
//    list.sort(Comparator.naturalOrder());
//        System.out.println();
//        for (Integer element : list) {
//            System.out.println(element);
//        }

//        Task 7

        List<Student> studentList = new ArrayList<>();
        Student s1 = new Student(111, "Jonas", 20, 5);
        Student s2 = new Student(222, "Petras", 25, 6);
        Student s3 = new Student(333, "Algis", 19, 4);
        Student s4 = new Student(444, "Antanas", 22, 9);
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);

        Collections.sort(studentList, new StudentAgeComparator());

        for (Student student : studentList) {

            System.out.println(student);
        }


//        Task 8

//        List<Game> gamesList = new ArrayList<>();
//        Game g1 = new Game("Play1", "Genre1", 20.0, 11);
//        Game g2 = new Game("Play2", "Genre2", 50.0, 222);
//        Game g3 = new Game("Play3", "Genre3", 40.0, 33);
//        Game g4 = new Game("Play4", "Genre4", 5.0, 4);
//
//        gamesList.add(g1);
//        gamesList.add(g2);
//        gamesList.add(g3);
//        gamesList.add(g4);
//
//        for (Game game : gamesList) {
//            System.out.println(game);
//        }
//
//        gamesList.remove(1);
//
//        Collections.sort(gamesList, new PriceComparator());
//        System.out.println();
//        for (Game game : gamesList) {
//            System.out.println(game);
//        }
//
//        Collections.sort(gamesList, new PriceComparator().reversed());
//        System.out.println();
//
////        static void printList(List<Game> list) {
////            for (Game component : list) {
////                System.out.println(component);
////            }
////        }
//        for (Game game : gamesList) {
//            System.out.println(game);
//        }

//        Task 9

//        List<Game> gamesList = new ArrayList<>();
//        Game g1 = new Game("Play1", "Genre1", 20.0, 11);
//        Game g2 = new Game("Play2", "Genre2", 50.0, 222);
//        Game g3 = new Game("Play3", "Genre3", 40.0, 33);
//        Game g4 = new Game("Play4", "Genre4", 5.0, 4);
//
//        gamesList.add(g1);
//        gamesList.add(g2);
//        gamesList.add(g3);
//        gamesList.add(g4);
//
//        for (Game game : gamesList) {
//            System.out.println(game);
//        }
//
//        gamesList.stream().forEach(game -> game.setPrice(game.getPrice()+5));
//
//        System.out.println();
//        for (Game game : gamesList) {
//            System.out.println(game);
//        }
//
//        List<Game> filteredGamesList = gamesList.stream().filter(game -> game.getPrice() > 10).filter(game -> game.getCopiesSold() > 50).collect(Collectors.toList());
//        System.out.println();
//        for (Game game : filteredGamesList) {
//            System.out.println(game);
//        }

        //Task 10

        List<Game> gamesList = new ArrayList<>();
        Game g1 = new Game("Play1", "Genre1", 20.0, 11);
        Game g2 = new Game("Play2", "Genre2", 50.0, 222);
        Game g3 = new Game("Play3", "Genre3", 40.0, 33);
        Game g4 = new Game("Play4", "Genre4", 5.0, 4);

        gamesList.add(g1);
        gamesList.add(g2);
        gamesList.add(g3);
        gamesList.add(g4);

        List<Game> newGamesList = gamesList.stream().sorted(Comparator.comparingDouble(Game::getPrice)).toList();
        Optional<Game> minCopies = gamesList.stream().min(Comparator.comparingDouble(Game::getCopiesSold));
        Game maxByCopiesSold = newGamesList.stream().max(Comparator.comparing(Game::getCopiesSold)).orElseThrow(NoSuchElementException::new);

        System.out.println();
        for (Game game : newGamesList) {
            System.out.println(game);
        }

        System.out.println("Min copies" + minCopies);
        System.out.println("Max copies" + maxByCopiesSold);


    }


}
