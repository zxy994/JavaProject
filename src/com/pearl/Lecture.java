package com.pearl;

import java.util.*;

//Lecture has an aggregate relationship with student class
public class Lecture {
    private String courseName;
    private String tutor;
    Student student;
    ArrayList<Double> highAverage = new ArrayList<>();

    int sizeOfLecture;

    //By default, you can set up the Lecture if
    //you have students that will attend the lecture
//    public Lecture(String courseName, String tutor, Student aStudent){
//        this.courseName = courseName;
//        this.tutor = tutor;
//        student = aStudent;
//             }

    //Getting the number of students and their individual
    //Average grades
    public void enter() {
        boolean tester = true;
        System.out.println("How many students are sitting for the lecture ? :");
        Scanner input = new Scanner(System.in);

        while (tester) {
           try {
                sizeOfLecture = input.nextInt();
               tester = false;
               input.nextLine();
           } catch(InputMismatchException e) {
               System.out.println("ENTER A NUMBER...");
               input.nextLine();
               continue;
           }
            System.out.println("Type their average grades : ");
           boolean tester2 = true;
           while(tester2)
           try{

            for (int i = 0; i < sizeOfLecture; i++) {
                highAverage.add(input.nextDouble());
                tester2 = false ;
            }
            } catch(InputMismatchException e){
               System.out.println("ENTER NUMBERS...");
               input.nextLine();
               continue ;
           }
        }
          //  getHighestAverage();
            }

           // Student obj;

    private void getObj() {
        // obj.setUpMap();
        for (Map.Entry i : Student.scoreList.entrySet()
        ) {
            lectureRec.put((String) i.getKey(), (Double) i.getValue());
            highAverage.add((Double) i.getValue());
        }


      //  public void getHighestAverage () {
            //getObj(obj);
            double highestAvg = highAverage.stream().mapToDouble(Double::doubleValue)
                    .max().getAsDouble();
            for (Map.Entry i : lectureRec.entrySet()
            ) {
                //highAverage.get(n++)
               // int n = 0;
                if ((Double) i.getValue() == highestAvg) {

                    System.out.println("The highest Average in the class is : " + " : "
                                        +i.getKey() +" : " +i.getValue());
                }

            }
      //  }
    }
        //Student obj = new Student();



    private HashMap<String, Double> lectureRec = new HashMap<>();
//    private void getHighestAvg2(){
//        for (
//             ) {
//
//        }
//    }

    public void enterFunc2(Student student){
        student.setUpMap();
    }
    //NaughtyStudent obj;
    public void enterFunc2(NaughtyStudent badStudent){
       //badStudent.gradeChanger();
      // Student tester = badStudent;
        getObj();

        for (Map.Entry i : lectureRec.entrySet()
        ) {
            if((Double) i.getValue() < Student.scoreList.get(badStudent.badStudentName) ){
                System.out.println("You are a naughty student...! " + NaughtyStudent.badStudentName +" : "
                        +Student.scoreList.get(badStudent.badStudentName));
            }

        }
    }

    //Overriding method in Object
    public String toString(){
        System.out.println(courseName +" : " +tutor +" : ");
        return String.valueOf(student);
    }
}
