public class Inherintance {
    public static void main(String[] args){
        Animal a=new Animal();
        Dog d=new Dog();
        a.makesound();
        d.makesound();

    }
}
class Animal{
    void makesound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    void makesound(){
        System.out.println("Dog Barks");
    }
}
