package ZZZ.Interview.MethodOverriding;

public class Child {


    public Child() {
        System.out.println("In default constructor method");
    }

    public Child(int a) {
        System.out.println("In one argument constructor method");
    }

    public void childFirst() {
        Parent p = new Parent();
        p.parentFirst();
        /**OR*/
        //super.parentFirst();
        System.out.println("child first");
    }

        public void childSecond() {
            System.out.println("child Second");
        }

        public void childThird() {
            System.out.println("Child third");
        }

        public void sameName() {
            System.out.println("same name in child class");
            //super.parentFirst();
        }


}
