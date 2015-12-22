package javaTopics;/* Authored by Kushagra on 12/19/2015. */

public class Inheritance {

    public static void main(String[] args) {
        Animal a1 = new Animal("Leopard");
        a1.speak();

        Mammals m1 = new Mammals("Whale");
        m1.speak();
        m1.setPregnancy(true);
        System.out.println(m1.getName());
        System.out.println(m1.getAnimalName());

        Humans h1 = new Humans("Kushagra");
        h1.setPregnancy(false);
        h1.setIQScore(100);
        h1.speak();
    }

    static class Humans extends Mammals {
        int iqScore;

        Humans(String name) {
            super(name);
            iqScore = 0;
        }

        private void setIQScore(int score) {
            this.iqScore = score;
        }
    }


    static class Mammals extends Animal {

        boolean isPregnant;

        Mammals(String name) {
            super(name);
            isPregnant = false;
        }

        public String getName() {
            return super.name;
        }

        public void setPregnancy(boolean flag) {
            this.isPregnant = flag;
        }

        public void speak() {
            System.out.println("Mammal Spoke !");
        }
    }


    static class Animal {

        private String name;

        Animal(String name) {
            this.name = name;
        }

       protected String getAnimalName() {
            return this.name;
        }

        public void speak() {
            System.out.println("Animals Spoke !");
        }
    }

}
