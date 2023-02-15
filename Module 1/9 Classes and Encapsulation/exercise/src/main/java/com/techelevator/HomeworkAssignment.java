package com.techelevator;

public class HomeworkAssignment {
    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;
    private String letterGrade;

    //Constructor class
    public HomeworkAssignment(int a, String b){
        this.possibleMarks = a;
        this.submitterName = b;
    }

    public String getLetterGrade() {
        double a = earnedMarks;
        double b = possibleMarks;
        double currentMarks = (a / b) * 100;

        if(currentMarks >= 90){
            this.letterGrade = "A";
            return "A";
        }
        else if (currentMarks >= 80 && currentMarks <= 89){
            this.letterGrade = "B";
            return "B";
        }
        else if (currentMarks >= 70 && currentMarks <= 79){
            this.letterGrade = "C";
            return "C";
        }
        else if (currentMarks >= 60 && currentMarks <= 69){
            this.letterGrade = "D";
            return "D";
        }
        else {
            this.letterGrade = "F";
            return "F";
        }
    }

    public int getEarnedMarks() {
        return earnedMarks;
    }

    public void setEarnedMarks(int num) {
        this.earnedMarks = num;
    }

    public String getSubmitterName() {
        return submitterName;
    }

    public int getPossibleMarks() {
        return possibleMarks;
    }
}

