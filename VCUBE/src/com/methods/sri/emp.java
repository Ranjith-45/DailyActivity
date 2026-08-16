package com.methods.sri;

class Student{
    int id;
    String name;
    int age;
   
    Student(int id,String name, int age ){
        this.id=id;
        this.name=name;
        this.age=age;
    }

    public static void min(String[] args){
        int id=325;
        String name ="Ranith";
        int age=21;
        Student st=new Student(id,name,age);
        st.display();
    }
    void display(){
        System.out.println("id"+id);
        System.out.println("Name"+name);
        System.out.println("age"+age);

    }
}