

abstract class Animals{

    public void eat(){
        System.out.println("eating");
    }
    public void sleep() {
        System.out.println("Zzz");

    }
}

interface aviary{
    public void flapWings(); // interface method (does not have a body)
    public void sleep(); }



class Pidgeon extends Animals implements aviary{

    public void flapWings() {
        System.out.println("Flap");
    }


}

public class Birds {

    static Pidgeon mahir = new Pidgeon();

    public static void main(String[] args) {

        mahir.flapWings();
        mahir.eat();
        mahir.sleep();
    }


}


