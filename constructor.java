 class A {

     protected boolean a;
     int x;
     String name;

     public A() {
         x = 1;
         name = " I love food";
     }

     void display() {
         System.out.println(x + " " + name);
     }


         public static void main(String[] args) {
           A obj = new A();
           obj.display();
         }
 }
