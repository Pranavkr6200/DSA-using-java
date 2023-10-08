import javax.imageio.stream.ImageInputStream;

class Outer {
    void outerMethod() {
        System.out.println("inside outerMethod");
        class Inner {
            void innerMethod() {
                System.out.println("inside innerMethod");
            } }

        Inner y = new Inner();
        y.innerMethod();
    } }
