package com.pearl;

import org.jetbrains.annotations.NotNull;

import java.util.*;

//What makes a student
public class Student implements Nameable,HasLevel {
    protected String name;
    protected List<Double> grade = new ArrayList<>();
   // protected List<Double> listOfAvgScores = new ArrayList<>();
  // HashMap<String, Double> listOfAvgScores = new HashMap<>();

    protected int numOfScores;
    protected double avgGrade;
    protected Scanner inputNum = new Scanner(System.in);

//A constructor
//    public Student(String name, Double avgGrade){
//        this.name = name ;
//        this.avgGrade = avgGrade ;
//        scoreList.put(this.name, this.avgGrade);
//    }

//  Should be able to set student name
    public String setName(String name) {
        this.name = name;
        return this.name;
            }
//  Should be able to set student grades
    public byte setGrade() {
//Need to know the number of scores user is entering to be able to loop
//to get all grade input into the list container
        boolean tester = true;
        System.out.print("How many scores are you entering : ");
        while (tester) {
            try {
                numOfScores = inputNum.nextInt();
                tester = false;
            } catch (InputMismatchException e) {
                System.out.println("ENTER A NUMBER...");
                inputNum.nextLine();
                continue;
            }
        }
//A loop to fill the list
        boolean tester2 = true;
        System.out.print("Input Grades : ");
        while (tester2) {
            try {
                inputNum.nextLine();
                for (int i = 0; i < numOfScores; i++) {
                    grade.add(inputNum.nextDouble());
                }
                tester2 = false ;
            } catch (InputMismatchException e) {
                System.out.println("ENTER NUMBERS...");
                    continue ;
                }
            }
//Including the getAvgGrade in the setGrade
//Anytime setGrade is called, getAvgGrade is called as well
        getAvgGrade();
        return 0;
    }

//Getting the average grade of student
    protected @NotNull
    void getAvgGrade(){
        avgGrade = grade.stream().mapToDouble(Double::doubleValue)
            .average().getAsDouble() ;
        System.out.print("Average of " +name +" is " +avgGrade +"\n");
        }

    public String toString(){
        System.out.print("Student name is : " +name +" Average: ");
        return String.valueOf(avgGrade);
   //     return String.valueOf(name);
    }

        protected static HashMap<String, Double> scoreList = new HashMap<>();
//    public Student() {
////        public void setUpMap() {
//
//            System.out.println("Enter number of students : ");
//            int size = inputNum.nextInt();
//
//            // System.out.println("Enter Name followed by average score : ");
//            inputNum.nextLine();
//            for (int i = 0; i < size; i++) {
//                System.out.print("Enter name of student : \n");
//                this.name = inputNum.nextLine();
//
//                System.out.print("Enter average of student : \n");
//                this.avgGrade = inputNum.nextDouble();
//                scoreList.put(name, avgGrade);
//                inputNum.nextLine();
//                // listOfAvgScores.put(this.name,this.avgGrade);
//            }
// //       }
//    }

    public void setUpMap() {

        System.out.println("Enter number of students : ");
        int size = inputNum.nextInt();

        // System.out.println("Enter Name followed by average score : ");
        inputNum.nextLine();
        for (int i = 0; i < size; ++i) {
            System.out.print("Enter name of student : \n");
            this.name = inputNum.nextLine();

            System.out.print("Enter average of student : \n");
            this.avgGrade = inputNum.nextDouble();
            scoreList.put(name, avgGrade);
            inputNum.nextLine();
            // listOfAvgScores.put(this.name,this.avgGrade);
        }
              }
        protected static List<String> forGetName = new ArrayList<>();
        public String getName(){
            for (Map.Entry i: scoreList.entrySet()
            ) {
               forGetName.add((String)i.getKey());
            }
        return this.name;
        }
        private static Level levels;
       //
    //
    //private static ArrayList<String>nameStudentByLevel = new ArrayList<>();

         protected static ArrayList<String> levelOnes = new ArrayList<>();
         protected static ArrayList<String> levelTwos = new ArrayList<>();
         protected static ArrayList<String> levelThrees = new ArrayList<>();
         protected static ArrayList<String> levelFours = new ArrayList<>();


        public Student(Level levels , String nameStudentByLevel){
            this.levels = levels ;
            switch (levels) {
                case ONE -> levelOnes.add(nameStudentByLevel);
                case TWO -> levelTwos.add(nameStudentByLevel);
                case THREE -> levelThrees.add(nameStudentByLevel);
                case FOUR -> levelFours.add(nameStudentByLevel);
                            }
        }
        public void getLevel(){
            System.out.println("Students entered into : " +this.levels);
                  }
}
