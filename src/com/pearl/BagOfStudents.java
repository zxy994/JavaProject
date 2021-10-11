package com.pearl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BagOfStudents <T>{
   T obj;

    protected Map<Level,Student> bag = new HashMap<>();
    protected ArrayList<Student> forBagClass = new ArrayList<>();

    public void add(Student variable){
        forBagClass.add(variable);
    }
    public void remove(Student variable){
        forBagClass.remove(variable);
    }
    public void clear(Student variable){
        forBagClass.clear();
    }
}
