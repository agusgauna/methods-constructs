import ar.com.ada.oop.instantiation.Person;
import ar.com.ada.oop.overloading.Arithmetic;

import javax.xml.namespace.QName;

public class App {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Agustina");
        Person person3 = new Person("Lorena","Suarez");
        Person person4 = new Person( "Daniela", "Perez", 20);
        person1.setName("Lara");
        person1.setLastName("Lopez");
        person1.setAge(24);
        person2.setLastName("Gauna");
        person2.setAge(27);
        person3.setAge(30);
        System.out.println("El nombre es " + person1.getName() + ", el apellido es " + person1.getLastName() + " y la edad es " + person1.getAge());
        System.out.println("El nombre es " + person2.getName() + ", el apellido es " + person2.getLastName() + " y la edad es " + person2.getAge());
        System.out.println("El nombre es " + person3.getName() + ", el apellido es " + person3.getLastName() + " y la edad es " + person3.getAge());
        System.out.println("El nombre es " + person4.getName() + ", el apellido es " + person4.getLastName() + " y la edad es " + person4.getAge());

        Arithmetic sum = new Arithmetic();
        int a = 1;
        int b = 2;
        int result1 = sum.sum(a, b);

        Integer a1 = 3;
        int b1 = 4;
        Integer result2 = sum.sum(a1, b1);

        int a2 = 5;
        Integer b2 = 6;
        Integer result3 = sum.sum(a2,b2);

        Integer a3 = 7;
        Integer b3 = 8;
        Integer result4 = sum.sum(a3, b3);

        double a4 = 9;
        double b4 = 10;
        double result5 = sum.sum(a4,b4);


        }
    }
