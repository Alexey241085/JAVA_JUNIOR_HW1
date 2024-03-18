package ru.gb.lesson1.hw;

import ru.gb.lesson1.Streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Homework {



  /**
   * Реалзиовать методы, описанные ниже:
   */

  /**
   * Вывести на консоль отсортированные (по алфавиту) имена персонов
   */
  public void printNamesOrdered(List<Streams.Person> persons) {
    persons.stream()
            .sorted(Comparator
            .comparing(Streams.Person::getName))
            .forEach(System.out::println);
  }
  /**
   * В каждом департаменте найти самого взрослого сотрудника.
   * Вывести на консоль мапипнг department -> personName
   * Map<Department, Person>
   */
//  public Map<Streams.Department, Streams.Person> printDepartmentOldestPerson(List<Streams.Person> persons) {
//
//
//
//    Map<String, List<Streams.Person>> sorByDepMaxSalaru = persons
//            .stream()
//            .collect(Collectors.groupingBy(it -> it.getDepartment().getName(), Collectors.maxBy(Comparator.comparing(s -> s.getSalary())));
//
////    qqqq.values().stream().forEach(it -> it.stream().max(Comparator.comparing(Streams.Person::getSalary)));
//
////return sorByDepMaxSalaru;
//
//  };



  public void   printDepartmentOldestPerson1 (List<Streams.Person> persons) {
    Map<Streams.Department, List<Streams.Person>> www = new HashMap<>();

//    Map<String, List<Streams.Person>>
                     persons.stream()
                    .collect(Collectors.groupingBy(it -> it.getDepartment()
                    .getName())).values().stream()
                    .forEach(it -> it.stream()
                    .collect(Collectors.toList())
                    .stream().max(Comparator.comparing(Streams.Person::getSalary))
                    .ifPresent(System.out::println));



//      qqqq.values().stream().forEach(it -> it.stream().collect(Collectors.toList()));


//              .max(Comparator.comparing(Streams.Person::getSalary)));

//    System.out.println("\n" + persons);
  };



  /**
   * Найти 10 первых сотрудников, младше 30 лет, у которых зарплата выше 50_000
   */
  public List<Streams.Person> findFirstPersons(List<Streams.Person> persons) {
//    throw new UnsupportedOperationException();
    persons.stream()
            .filter(it -> it.getAge() < 30)
            .filter(s -> s.getSalary() > 50_000).limit(10)
            .forEach(System.out::println);
    return persons;
  }



  /**
   * Найти депаратмент, чья суммарная зарплата всех сотрудников максимальна
   */
//  public Optional<Streams.Department> findTopDepartment(List<Streams.Person> persons) {
////    throw new UnsupportedOperationException();
//    persons.stream()
//            .collect(Collectors.groupingBy(it -> it.getDepartment()
//            .getName())).values().stream()
//            .forEach(it -> it.stream()
//            .collect(Collectors.toList())
//            .stream().
//            .ifPresent(System.out::println));
//
//  }

}
