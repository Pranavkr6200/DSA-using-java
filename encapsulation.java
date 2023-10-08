class encapulation {
    private int value;
    public void setvalue(int x){
        value=x;
    }
    public int getValue(){
        return value;
    }
}
class B {
    public static void main(String[] args) {
            encapulation obj = new encapulation();
            obj.setvalue(500);
        System.out.println(obj.getValue());
    }
}
