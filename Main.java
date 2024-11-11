package org.example;

import org.example.book.Book;
import org.example.student.Student;

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

    }

      }