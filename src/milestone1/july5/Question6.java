package milestone1.july5;

public class Question6 {
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("No value");
        }
        else{
            for(String s:args){
                System.out.print(s+",");
            }
        }
    }
}
