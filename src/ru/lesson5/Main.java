package ru.lesson5;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("User1", 16));
        users.add(new User("User2", 25));
        users.add(new User("User3", 46));
        users.add(new User("User4", 9));
        users.add(new User("User5", 19));
        users.add(new User("User6", 95));
        users.add(new User("User7", 2));

        for(User u : users) {
            System.out.println(u.getName() + " " + u.getAge());
        }

        Comparator<User> comparator = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge() - o2.getAge();
            }
        };

        users.sort(comparator);

        System.out.println("---------------");

        for(User u : users) {
            System.out.println(u.getName() + " " + u.getAge());
        }


        /*---------------------------------------*/

        SomeInterface someInterface = str -> System.out.println("Hello");
        someInterface.some("123");

        SomeSort someSort = ((u1, u2) -> u1.getAge() - u2.getAge());

        /*---------------------------------------*/

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(-2);
        integers.add(8);
        integers.add(16);
        integers.add(33);
        integers.add(88);
        integers.add(63);
        integers.add(2);
        integers.add(-96);
        integers.add(-7);

        List<Integer> sortedList = new ArrayList<>();

        for(Integer current : integers) {
            if(current < 100) {
                sortedList.add(current);
            }
        }

        /*или*/

        IntStream intStream = IntStream
                .of(1, -2, 96, 152, -69, 568, 5587, 64)
                .filter(it)
                .forEach(System.out::println);

        Stream<String> stream;
        IntStream intStream1;
        DoubleStream doubleStream;
        LongStream longStream;

        Optional<User> max = users
                .stream()
                .max((a1, a2) );

        System.out.println(max.get().getAge());


    }
}
