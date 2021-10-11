package com.pearl;

import java.util.ArrayList;
import java.util.List;

import static com.pearl.Student.*;

public class Register {
    List<Nameable> nameables = new ArrayList<>();
  //  protected List<String> forGetName = new ArrayList<>();

    public void register1(List<Nameable> nameables){
    this.nameables = nameables ;
    }

   // Student obj;
  //  public List<String> getRegister(){
        public void getRegister(){
        System.out.println(Student.forGetName);
     //  return Student.forGetName;

    }
//    public String toString(){
//                return String.valueOf(Student.forGetName);
//        //     return String.valueOf(name);
//    }
        public void getRegByLevel(Level enterLevel){
        switch(enterLevel){
            case ONE -> System.out.println("Students in Level one : " +levelOnes);
            case TWO -> System.out.println("Students in Level one : " +levelTwos);
            case THREE -> System.out.println("Students in Level one : " +levelThrees);
            case FOUR -> System.out.println("Students in Level one : " +levelFours);
        }
        }
        public void printReport(){
            System.out.printf("%-10s%n", "LEVEL_ONE ");
            System.out.printf("%-10s%n", "--------- ");
            for (int i = 0 ; i < levelOnes.size(); i++){
                System.out.println(levelOnes.get(i));
            }
            System.out.printf("%-10s%n", "\nLEVEL_TWO ");
            System.out.printf("%-10s%n", "--------- ");
            for (int i = 0 ; i < levelTwos.size(); i++){
                System.out.println(levelTwos.get(i));
            }
            System.out.printf("%-10s%n", "\nLEVEL_THREE ");
            System.out.printf("%-10s%n", "---------- ");
            for (int i = 0 ; i < levelThrees.size(); i++){
                System.out.println(levelThrees.get(i));
            }
            System.out.printf("%-10s%n", "\nLEVEL_FOUR ");
            System.out.printf("%-10s%n", "---------- ");
            for (int i = 0 ; i < levelFours.size(); i++){
                System.out.println(levelFours.get(i));
            }
        }
}
