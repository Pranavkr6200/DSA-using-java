abstract class animal
{
    public abstract void sound();
}
class dog extends animal{
    public void sound() {
        System.out.println("dog is roar");
    }
}
class lion extends animal{

    public void sound() {
        System.out.println("lion is barking");
    }
}
class C{
    public static void main(String[] args) {
        dog d= new dog();
        lion l =new lion();
        d.sound();
        l.sound();

    }
}
