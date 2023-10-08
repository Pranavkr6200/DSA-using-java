class M{
  void show(){
      System.out.println("hello");
  }
}
class T extends M{
    void show(){
          super.show();
        System.out.println("hi shukla");
    }
}
class Super1{
    public static void main(String[] args) {
        T r =new T();
        r.show();
    }
}