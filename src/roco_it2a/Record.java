package roco_it2a;


public class Record {
    
    int ID, age;
    float bmi;
    String Aname, goal;
    
    public void AddApplicants(int id, String pname, int age, float bmi, String goals){
        
        this.ID = id;
        this.Aname = pname;
        this.age = age;
        this.bmi = bmi;
        this.goal = goals;
        
    }
    
    public void viewApplicants(){
        
        System.out.printf("%-5d %-10s %-10d %-10f %-5s", ID, Aname, age, bmi, goal);
        
    }
    
}
