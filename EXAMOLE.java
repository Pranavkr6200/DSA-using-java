public class EXAMOLE {

        int id;
        int salary;
        String name;

        void setId(int i){
            id =i;
        }
        void SetName(String n){
            name=n;
        }
        void Setsalary(int s){
            salary=s;
        }
        void getdetail(){
            System.out.println(name+" salary is "+salary);
    }
    public static void main(String[] args) {
        EXAMOLE e1 = new EXAMOLE();
        e1.setId(12);
        e1.SetName("shivam");
        e1.Setsalary(5000);
        e1.getdetail();
    }

}