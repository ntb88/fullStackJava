package abstractexample.MedicineExample;

public class Syrup extends Medicine{
    @Override
    public void displayLabel() {
        super.displayLabel();
        System.out.println("info: only use 20ml per day\n");
    }
}
