package org.example.student;

public class Student implements Printable  {
    private String studentName;
    private int recordBookNumber;
    private double avgScore;

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setRecordBookNumber(int recordBookNumber) {
        this.recordBookNumber = recordBookNumber;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }
    public String getStudentName(){
        return studentName;
    }

    public int getRecordBookNumber() {
        return recordBookNumber;
    }

    public double getAvgScore() {
        return avgScore;
    }

    @Override
    public void print() {
        System.out.println("Student's name: " + studentName );
        System.out.println("Record book number: " + recordBookNumber);
        System.out.println("Average score: " + avgScore);

    }
}
