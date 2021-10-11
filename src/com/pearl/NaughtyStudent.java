package com.pearl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class NaughtyStudent extends Student{
//
//    public NaughtyStudent(String name, Double avgGrade) {
//
//        super(name, avgGrade);
//    }
  //  for(Map.Entry i : scoreList.entry)
   // HashMap<String, Double> name = (HashMap<String, Double>) scoreList.entrySet();

    private List<Double> modifiedVal = new ArrayList<>();
    Double tempHold;

    public NaughtyStudent(Level levels, String nameStudentByLevel) {
        super(levels, nameStudentByLevel);
    }

    public void checker(){
        for (Map.Entry i: scoreList.entrySet()
             ) {
            tempHold = (((Double) i.getValue()) * 0.1 ) + (Double) i.getValue();
            modifiedVal.add(tempHold);
        }
    }
    public void modFunc(){
        for (Map.Entry i: scoreList.entrySet()
             ) {
            int n = 0;
            if((Double) i.getValue() == modifiedVal.get(n++)){
                System.out.println("You are a naughty student...!" + i.getKey() +" : "
                                    +i.getValue());
            }
        }
    }
    protected static String badStudentName;
    public void gradeChanger(){

       System.out.println("Type Name : ");
         badStudentName = inputNum.nextLine();
        Double temp2 = scoreList.get(badStudentName) ;
        tempHold = (temp2 * 0.1) + temp2 ;
     //   tempHold = ( temp2 * 0.1 ) + scoreList.get(name);
        scoreList.replace(badStudentName,temp2,tempHold);
        System.out.println("Change confirmed : " +temp2 +" is now "
                            +tempHold);
    }
}
