package com.anubhav;
import java.util.HashMap;
import java.util.Map;
public class Solution {
    Map<Integer, Student> studentById= new HashMap<Integer, Student>()
    {{
            put(1, new Student(1, true)); put(2, new Student(2, true));
    }};

    public static void main(String[] args) {
        Solution solution = new Solution();
        try{
            solution.getStudent(1);
        }catch (java.lang.InternalError ex){
            System.out.println("IllegalArgumentException = "+ ex.getMessage());
        }
    }
    // JIT
    private Student getStudent(int id){
        if(this.studentById.containsKey(id)){
            return this.studentById.get(id);
        }
        // return null;

        return new Student(-1, false);

        //throw new InternalError("id not found");
    }
}
class Student{
    public Student(int id, boolean sucess) {
        this.id = id;
        this.isSuccess = sucess;
    }
    int id;

    boolean isSuccess ;

    String errorMessage;
}