public class try_catch {
    public static void main(String[] args) {
        String str ="shukla";
          try {
              int a = Integer.parseInt(str);
              System.out.println(a);
          }
          catch (Exception n){
              System.out.println("exception found");
              System.out.println("kuch karte hai");
              System.out.println(n);

          }
          finally {
              System.out.println("done");
          }
        System.err.println("hi");
        System.out.println("ho gaya handle 👍");
    }
}
