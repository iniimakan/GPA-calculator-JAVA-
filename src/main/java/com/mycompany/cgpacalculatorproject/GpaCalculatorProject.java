/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cgpacalculatorproject;

import java.util.Scanner;

/**
 *
 * @author my pc
 */
public class GpaCalculatorProject {
    
    public String getGrade (double score){
        String grade = "F";
        if(score >= 70 && score <= 100){
            grade = "A";
        } else if (score >= 60 && score <= 69){
            grade = "B";
        } else if (score >= 50 && score <= 59){
            grade = "C";
        } else if (score >= 45 && score <= 49){
            grade = "D";
        } else if (score >= 40 && score <= 44){
            grade = "E";
        } else if (score >= 0 && score <= 39){
            grade = "F";
                    }
        
        return grade;
        
    }
    public int getPoint(String grade){
        int point = 0;
        switch(grade){
            case "A":
                point = 5;
                break;
            case "B":
                point = 4;
                break;
            case "C":
                point = 3;
                break;
            case "D":
                point = 2;
                break;
            case "E":
                point = 1;
                break;
            case "F":
                point = 0;
        }
        return point;

}

    public static void main(String[] args) {
        System.out.println("GRADING SYSTEM");
        
        Scanner i = new Scanner(System.in);
//        first course
        System.out.print("Enter Course 1: ");
        String course1 = i.nextLine();
        
        System.out.print("Enter " + course1 + " grade: ");
        int gradeUnit1 = i.nextInt();
        
        System.out.print("Enter " + course1 + " score: ");
        double score1 = i.nextDouble();
        
        i.nextLine();
//        second course
        System.out.print("Enter Course 2: ");
        String course2 = i.nextLine();
        
        System.out.print("Enter " + course2 + " grade: ");
        int gradeUnit2 = i.nextInt();
        
        System.out.print("Enter " + course2 + " score: ");
        double score2 = i.nextDouble();
        
        i.nextLine();
//        third course
        System.out.print("Enter Course 3: ");
        String course3 = i.nextLine();
        
        System.out.print("Enter " + course3 + " grade: ");
        int gradeUnit3 = i.nextInt();
        
        System.out.print("Enter " + course3 + " score: ");
        double score3 = i.nextDouble();
        
        i.nextLine();
//        fourth course
        System.out.print("Enter Course 4: ");
        String course4 = i.nextLine();
        
        System.out.print("Enter " + course4 + " grade: ");
        int gradeUnit4 = i.nextInt();
        
        System.out.print("Enter " + course4 + " score: ");
        double score4 = i.nextDouble();
        
        i.nextLine();
//        fifth course
        System.out.print("Enter Course 5: ");
        String course5 = i.nextLine();
        
        System.out.print("Enter " + course5 + " grade: ");
        int gradeUnit5 = i.nextInt();
        
        System.out.print("Enter " + course5 + " score: ");
        double score5 = i.nextDouble();
        
        GpaCalculatorProject gpa = new GpaCalculatorProject();
        
        String grade1 = gpa.getGrade(score1);
        String grade2 = gpa.getGrade(score2);
        String grade3 = gpa.getGrade(score3);
        String grade4 = gpa.getGrade(score4);
        String grade5 = gpa.getGrade(score5);
        
        int point1 = gpa.getPoint(grade1);
        int point2 = gpa.getPoint(grade2);
        int point3 = gpa.getPoint(grade3);
        int point4 = gpa.getPoint(grade4);
        int point5 = gpa.getPoint(grade5);
        
        int totalGradeUnit  = gradeUnit1 +  gradeUnit2 + gradeUnit3 + gradeUnit4 + gradeUnit5;
        
        double quality1 = (point1  * gradeUnit1);
        double quality2 = (point2  * gradeUnit2);
        double quality3 = (point3  * gradeUnit3);
        double quality4 = (point4  * gradeUnit4);
        double quality5 = (point5  * gradeUnit5);
        
        double qualityPoint = quality1 + quality2 + quality3 +quality4 +quality5;
        
        
        double score = qualityPoint/totalGradeUnit;

        System.out.println("|------------|-------------|--------|-------------|");
        System.out.println("|   COURSE   | COURSE UNIT |  GRADE | GRADE UNIT  |");
        System.out.println("|------------|-------------|--------|-------------|");
        System.out.println(course1 +"|-----|" + gradeUnit1 + "|----|" + grade1 + "|------|" + point1);
        System.out.println(course2 +"|-----|" + gradeUnit2 + "|----|" + grade2 + "|------|" + point2);
        System.out.println(course3 +"|-----|" + gradeUnit3 + "|----|" + grade3 + "|------|" + point3);
        System.out.println(course4 +"|-----|" + gradeUnit4 + "|----|" + grade4 + "|------|" + point4);
        System.out.println(course5 +"|-----|" + gradeUnit5 + "|----|" + grade5 + "|------|" + point5);
        System.out.println(" Your GPA is: " + score);
    }
}
