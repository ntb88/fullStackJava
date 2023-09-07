package abstractexample.MedicineExample;

public class Ointment  extends Medicine{
    @Override
    public void displayLabel() {
        super.displayLabel();
        System.out.println("info: This Ointment is For external use only!\n");
    }
}
