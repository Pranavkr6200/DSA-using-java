import java.util.*;
interface client{
    void input();
    void output();
}
 class Pranav implements client{
    String name;
    Double sal;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        name = sc.nextLine();

        System.out.println("Enter the salary");
        sal = sc.nextDouble();
        }
    public void output(){

        System.out.println(name+" "+sal);
    }
    public static void main(String[] args) {
        client c = new Pranav();
        c.input();
        c.output();
    }
}