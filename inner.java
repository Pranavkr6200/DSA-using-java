class outer{
    static class inner{
        public void show(){
            System.out.println("i an radhe");
        }
    }
}
class Z {
    public static void main(String[] args) {
        outer.inner in = new outer.inner();
        in.show();
    }
}
