package ru.lesson5;

import java.util.*;

public class Collection {
    //интерфейсы
    java.util.Collection<String> collection;

    Queue<String> queue; //очередь. работа с данными в виде очереди
    Deque<String> deque; //двунаправленная очередь. можно вставлять как в начало, так и в конец

    List<String> list;

    Set<String> set; //только уникальные значения
    SortedSet<String> sortedSet; //уникальные значения отсортированные
    NavigableSet<String> navigableSet; //элементы по соответствию

    Map<String, String> map; //ключ уникальный


    //абстрактные классы
    AbstractCollection<String> abstractCollection;
    AbstractList<String> abstractList;
    AbstractSet<String> abstractSet;
    AbstractQueue<String> abstractQueue;

    AbstractSequentialList<String> abstractSequentialList; //расширяет AbstractList. Для создания связанных списков
    AbstractMap<String, String> abstractMap;

    //конкретные реализации
    ArrayList<String> arrayList;
    LinkedList<String> linkedList; //связанный список

    ArrayDeque<String> arrayDeque;

    HashSet<String> hashSet; //хранение только уникальные значение
    TreeSet<String> treeSet; //ввиде бинарного дерева
    LinkedHashSet<String> linkedHashSet;

    PriorityQueue<String> priorityQueue; //позволяет добавлять элементы с приоритетом

    HashMap<String, String> hashMap;
    TreeMap<String, String> treeMap;







    /*List<Integer> collection = new ArrayList<>() {{
        add(-35);
        add(-1);
        add(0);
        add(13);
        add(2);
        add(100);
        add(6558);
        add(99);
    }};

        Collections.sort(collection);

        for(Integer i : collection) {
        System.out.println(i);
    }

    Comparator<Integer> comparator = Collections.reverseOrder(); //указание что сделать с коллекцией

        collection.sort(comparator);

        System.out.println("---------------------");

        for(Integer i : collection) {
        System.out.println(i);
    }

        Collections.shuffle(collection);

        System.out.println("----------------------");

        for(Integer i : collection) {
        System.out.println(i);
    }*/


}
