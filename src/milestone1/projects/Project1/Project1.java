package milestone1.projects.Project1;

import java.util.Arrays;

public class Project1 {
    public static void main(String[] args) {
        //Employee Database
        int [] empNumber = {1001,1002,1003,1004,1005,1006,1007};
        String[] empName = {"Ashis","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
        String[] joiningDate = {"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","01/01/2000","12/06/2006"};
        char[] desigCode = {'e','c','k','r','m','e','c'};
        String[] dept = {"R&D","PM","Acct","Front Desk","Engg","Manufacture","PM"};
        double[] basic = {20000,30000,10000,12000,50000,23000,29000};
        double[] hra = {8000,12000,8000,6000,20000,9000,12000};
        double[] it = {3000,9000,1000,2000,20000,4400,10000};

        //get argument value
        int empid = Integer.parseInt(args[0]);
        int flag=0;
        for(int i = 0; i < empName.length; i++) {
            if(empid==empNumber[i])
                flag=i;
        }
        //flag for check employee and index
        if(flag==0){
            System.out.println("There is no employee with empid :"+empid);
            return;
        }
        double salary;
        double da;
        String designation;
        char dc =desigCode[flag];
        switch (dc){
            case 'e':
               da = 20000;
               designation = "Engineer";
               break;
            case 'c':
                da = 32000;
                designation = "Consultant";
                break;
            case 'k':
                da = 12000;
                designation = "Clerk";
                break;
            case 'r':
                da = 15000;
                designation = "Receptionist";
                break;
            case 'm':
                da = 40000;
                designation = "Manager";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + dc);
        }

        System.out.println("Employee Number:"+empNumber[flag]);
        System.out.println("Employee Name:"+empName[flag]);
        System.out.println("Department:"+dept[flag]);
        System.out.println("Designation:"+designation);
        System.out.println("Salary:"+(basic[flag]+hra[flag]+da-it[flag]));



    }
}
