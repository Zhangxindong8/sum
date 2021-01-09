public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.ANIMAL_BEHAVIOR);
        System.out.println(Animal.ANIMAL_BEHAVOOR);
        dog.breathe();
        dog.run();
        dog.liveOnLand();
    }
}
interface Animal {
    String ANIMAL_BEHAVIOR = "动物的行为";
    void breathe();
    void run();
}
interface LandAnimal extends Animal {
    void liveOnLand();
}
class Dog implements LandAnimal{
    public void breathe(){
        System.out.println(ANIMAL_BEHAVIOR+":"+"狗在呼吸");
    }
    public void run(){
        System.out.println(ANIMAL_BEHAVIOR+":"+"狗在奔跑");
    }
    public void liveOnLand(){
        System.out.println("狗是陆地上的动物");
    }
}
