package org.example;

import org.example.book.Book;
import org.example.car.Car;
import org.example.clock.Сlock;
import org.example.clock.Сlock;
import org.example.point.Point;
import org.example.student.Student;

import java.time.Clock;
import java.util.concurrent.Callable;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how Aqua suggests fixing it.
        /** task1 Book*/

        Book Kniga1 = new Book();
        Kniga1.setName ("Tom Sawyer Detective");
        Kniga1.setAuthor("Mark Twain");
        Kniga1.setYear(1896);
         ;
         Kniga1.display();

         /** task2 Student */

        Student student1 = new Student();
        student1.setStudentName("Asya Isaikina");
        student1.setRecordBookNumber(12);
        student1.setAvgScore(4.3);

        student1.print();

        /** task 4 Clock */

        Сlock clock1 = new Сlock();
        clock1.setHours(20);
        clock1.setMinutes(12);
        clock1.setSeconds(25);

        clock1.tick();

        clock1.readTime();
    /** task 3 Point **/

        Point point1 = new Point();
        point1.setX(12.0);
        point1.setY(6.0);
        point1.moveUp();
        point1.print();

        /** task 5 Car **/

        Car car1 = new Car();
        car1.setBrand("Mazda");
        car1.setModel("E320");
        car1.setYear(2001);
        car1.setDistance(600);
        car1.start();
        car1.drive();


    }

      }