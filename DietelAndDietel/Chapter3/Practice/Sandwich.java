public class Sandwich{
    private String whichSandwich;

    public void setSandwich(String sandwich){
        whichSandwich = sandwich;
    }

    public String getSandwich(){
        return whichSandwich;
    }

    public void deliverSandwich(){
        System.out.printf("Take you Sandwich: %s", getSandwich());
    }
}
