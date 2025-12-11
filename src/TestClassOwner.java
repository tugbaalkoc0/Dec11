
public class TestClassOwner {
    public static void main(String[] args) {
        Room room = new Room("Guest Room " ,3 , 40);
        Building building = new Building("Blue hotel",room , 50);

        System.out.println("Total area of Blue Hotel : " + building.getTotalArea());

        Owner[] ownerList = new Owner[2];
        ownerList[0] = new Owner("Ali " , 123);
        ownerList[1] = new Owner("Zeynep" , 456);

    }

}
