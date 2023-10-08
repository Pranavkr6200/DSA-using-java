//By extending Thread class

class S extends Thread{
    public void run(){
        for(int i=0;i<5;i++)
        {
            System.out.println("shukla");
        }
    }
}
class P{
    public static void main(String[] args) {
        S t= new S();
        t.start();
        for(int i=0;i<5;i++){
            System.out.println("Pranav");
        }
    }
}


//By implementing Runnable interface.
class Zone implements Runnable{
    public void run(){

        System.out.println("hello guys");
    }
}
class Y{
    public static void main(String[] args) {
         Zone r =new Zone();
         Thread t = new Thread(r);
         t.start();
    }
}