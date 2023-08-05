package com.example.mongorecipesaver.testing;

public class Test {

    public static void main(String[] args){
        Test test = new Test();
    }
    public Test(){
        Dauther dauther = new Dauther();
        Parent parent = new Parent();
        dauther = (Dauther) parent;
    }

}
