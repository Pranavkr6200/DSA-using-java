abstract class god{
    abstract void chants();
}
class krishn extends god{
    void chants(){
        System.out.println("radhe radhe");
    }
}
class karn extends god{
    void chants(){
        System.out.println("radhey radhey");
    }
}
public class krish {
    public static void main(String[] args) {
        god k =new krishn();
        god r = new karn();
        k.chants();
        r.chants();
    }
}

