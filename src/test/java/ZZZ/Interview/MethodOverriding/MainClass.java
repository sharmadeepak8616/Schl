package ZZZ.Interview.MethodOverriding;

public class MainClass {

    public static void main(String[] args) {

        Child c1 = new Child(2);
        //c1.childFirst();


        //Parent p1 = new Child();
        //p1.sameName();

        //Child c2 = new Parent();

        //Parent p2 = new Parent();
        //p2.sameName();

        /**
         * Child c1 = new Child(); -> can execute child-&-parent class methods
         * Parent p1 = new Child(); -> can execute child-&-parent class methods
         * Parent p2 = new Parent(); -> can execute only parent class
         * Child c2 = new Parent();  -> Invalid
         */


        /*
        c1.childSecond();
        c1.childThird();
        c1.parentFirst();

        Parent p1 = new Parent();
        p1.parentFirst();
        p1.parentSecond();


        Parent p2 = new Child();
        p2.parentSecond();
        ((Child) p2).childSecond();
        */




    }


}
