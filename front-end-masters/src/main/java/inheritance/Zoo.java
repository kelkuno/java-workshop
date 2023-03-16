package inheritance;

public class Zoo {

    public static void main(String[] args) {
        Dog rocky = new Dog();
//        rocky.fetch();
//        rocky.makeSound();
        feed(rocky);

        Animal sasha = new Dog();
//        sasha.makeSound();
//        feed(sasha);
        sasha = new Cat();
        sasha.makeSound();
        feed(sasha);
    }

    public static void feed(Animal animal){
        //can take Animal or subclass of animal
        if(animal instanceof Dog){
            System.out.println("here's your dog food");
        } else if (animal instanceof Cat) {
            System.out.println("here's your cat");
        }
    }
}
