package tvu;

public class runMain {

	public static void main(String[] args) {
		Animal a = new Animal("Animal");
        Mammal m = new Mammal("Mammal");
        Cat c = new Cat("Kitty");
        Dog d1 = new Dog("Lucky");
        Dog d2 = new Dog("Tommy");

        System.out.println(a);
        System.out.println(m);
        System.out.println(c);
        System.out.println(d1);

        System.out.println();

        c.greets();

        d1.greets();

        d1.greets(d2);
	}

}
