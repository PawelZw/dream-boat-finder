package filters;

import boats.Boat;

public class HorsePowerRange implements Predicate  {

    private int minEnginePower;
    private int maxEnginePower;

    public HorsePowerRange(int minEnginePower, int maxEnginePower) {
        this.minEnginePower = minEnginePower;
        this.maxEnginePower = maxEnginePower;
    }

    @Override
    public boolean predict(Boat boat) {

        return(boat.getPrice() <= maxEnginePower && boat.getPrice() >= minEnginePower);
    }

}
