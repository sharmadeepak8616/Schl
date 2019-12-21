package ZZZ.Interview.Static;

public class Static_Concepts_Use {


    public static void main(String[] args) {

        System.out.println(Static_Concepts.abc);
        Static_Concepts.sayHello();


        Static_Concepts sc1 = new Static_Concepts();
        sc1.sayHello2(); //i = 1  ; j = 1
        sc1.getIJ();

        Static_Concepts sc2 = new Static_Concepts();
        sc2.getIJ(); //i = 1 ;  j = 0

        Static_Concepts sc3 = new Static_Concepts();
        sc3.sayHello2();
        sc3.getIJ(); //i = 2 ;  j = 1

    }


}
