package programme_17_carpetcostcalculator;

public class Calculator {
    Floor floor;
    Carpet carpet;

    public Calculator (Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }
    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}



