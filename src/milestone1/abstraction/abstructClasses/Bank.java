package milestone1.abstraction.abstructClasses;

abstract class GeneralBank{
    abstract double getSavingInterestRate();
    abstract double getFixedInterestRate();
}

class ICICIBank extends GeneralBank{
    double getSavingInterestRate(){
        return .04;
    }
    double getFixedInterestRate(){
        return .085;
    }
}

class KotMBank extends GeneralBank{
    double getSavingInterestRate(){
        return .06;
    }
    double getFixedInterestRate(){
        return .09;
    }
}


public class Bank {
    public static void main(String[] args) {
        ICICIBank iciciBank = new ICICIBank();
        System.out.println("ICICI Bank Saving Interest:"+iciciBank.getSavingInterestRate());
        System.out.println("ICICI Bank Fixed Interest:"+iciciBank.getFixedInterestRate());
        KotMBank kotMBank = new KotMBank();
        System.out.println("KotMBank Bank Saving Interest:"+kotMBank.getSavingInterestRate());
        System.out.println("KotMBank Bank Fixed Interest:"+kotMBank.getFixedInterestRate());
        GeneralBank general = new ICICIBank();
        System.out.println("call ICICIBank method using general class reference:"+general.getSavingInterestRate());
        GeneralBank general2 = new KotMBank();
        System.out.println("call KotMBank method using general class reference:"+general2.getSavingInterestRate());

    }
}
