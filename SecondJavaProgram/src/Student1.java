//package com.jcg.example;
public class Student1 {

    private String name;

    private String maths;

    private String science;

    private String english;

    public Student1(){}

    public Student1(String name, String maths, String science, String english) {

        this.name = name;

        this.maths = maths;

        this.science = science;

        this.english = english;

    }


    public String toString() {

        return name+ ": Maths "+maths+ " Science "+science+" English "+english;

    }

}

