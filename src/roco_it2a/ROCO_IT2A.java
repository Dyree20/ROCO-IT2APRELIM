package roco_it2a;

import java.util.Scanner;

public class ROCO_IT2A{


    public static void main(String[] args) {
            
   
      public void getApplicants(){
        
        Scanner scr = new Scanner(System.in);
        
        System.out.println("Enter no. of Applicants");
        int numA = scr.nextInt();
        
        for (int i = 0 ; i <= numA ; i++ ){
            
            System.out.println("Enter Details of applicant " +i);
            System.out.println("Enter ID: ");
            int ID = scr.nextInt();
            scr.nextLine();
            
            System.out.println("Enter Name: ");
            String pname = scr.nextLine();
            
            
            System.out.println("Enter Age:  ");
           int age = scr.nextInt();
            scr.nextLine();
            
            System.out.println("Enter Bmi: ");
           float bmi =  scr.nextFloat();
            scr.nextLine();
           
            System.out.println("Fitness Goal:");
          String goal = scr.nextLine();
           
           
                
        }
    }
    }
