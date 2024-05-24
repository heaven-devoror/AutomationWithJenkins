package HouseConstruction;

public class Owner2 implements Construction {

    public void bricksArrangement() {
        System.out.println("Bricks");
    }

    public void cementAcquisition() {
        System.out.println("Cement");
    }

    public void rodsAcquisition() {
        System.out.println("rods");
    }

    public static void main(String[] args) {
        Owner2 obj = new Owner2();
        obj.bricksArrangement();
        obj.cementAcquisition();
        obj.rodsAcquisition();
    }
}
