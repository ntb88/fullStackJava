package abstractexample.MedicineExample;

public class Tablet extends Medicine{
    @Override
    public void displayLabel() {
        super.displayLabel();
        System.out.println("info: Store this tablet in a cool dry place\n");
    }
}
