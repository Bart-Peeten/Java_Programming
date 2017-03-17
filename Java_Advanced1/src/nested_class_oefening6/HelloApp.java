package nested_class_oefening6;

/**
 * Created by peetenbart on 07-03-17.
 */
public class HelloApp {
    public static void main(String[] args) {
        Hello hello = new Hello() { // Dit is met anonieme classe
            @Override
            public void print() {
                System.out.println("Hello World Old Style!!");
            }
        };

        Hello hello1 = () -> System.out.println("Hello World Lambda Expression !!!!");

        hello.print();
        hello1.print();


        HelloNew helloNew = t -> System.out.println(t); // Hetzelfde als hierboven behalve met Lambda expressions.
        helloNew.print("\n\nHallo");
    }

    public interface Hello{
        public void print();
    }

    public interface HelloNew{
        void print(String text);
    }
}
