package Programme_24_methodoverrriding;

public class Test2 {

    public static void main(String[] args) {
        SBI S = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI rate of interest  :  " + S.getRateOfInterest());
        System.out.println(" ICICI rate of interest : " + i.getRateOfInterest());
        System.out.println(" AXIX rate of interest : " + a.getRateOfInterest());
    }
}
