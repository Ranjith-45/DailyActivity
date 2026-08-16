package com.methods.constructors;


class Studnt{
    int id;
    String name;
    int age;
    Student(){
        System.out.println("Srikar");
    }
    Studnt(int id,String name, int age ){
        this.id=id;
        this.name=name;
        this.age=age;
    }

    public static void min(String[] args){
        int id=325;
        String name ="Ranith";
        int age=21;
        Studnt st=new Studnt();
    }
    void display(){
        System.out.println("id"+id);
        System.out.println("Name"+name);
        System.out.println("age"+age);

    }
}
