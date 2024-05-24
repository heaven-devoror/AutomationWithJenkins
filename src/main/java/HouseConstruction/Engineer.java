package HouseConstruction;

public abstract class Engineer implements Construction {

    public void bricksArrangement() {
        System.out.println("Bricks arrange Successfully");
    }

    public void cementAcquisition() {
        System.out.println("Cement acquisition completed");
    }

    public void rodsAcquisition() {
        System.out.println("rods purchase in progress");
    }

    public abstract void paymentPermission();

}
