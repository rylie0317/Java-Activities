import java.util.Scanner;

class PurchaseItem{
    String itemName;
    double itemPrice;
    int itemQuantity;
    double amountDue;

    Scanner s = new Scanner(System.in);

    public void setItemName(String itemName){
        this.itemName = itemName;
    }
    public void setTotalCost(int quantity, double price){
        amountDue = quantity * price;
    }
    public String getItemName(){
        return itemName;
    }
    public double getTotalCost(){
        return amountDue;
    }
    public void readInput(){
        System.out.println("Enter the item you are purchasing.");
        itemName = s.nextLine();
            System.out.println("Enter the quantity and price separated by a space.");
        itemQuantity = s.nextInt();
        itemPrice = s.nextDouble();
    }
    public void writeOutput(){
        System.out.println("You are purchasing " + itemQuantity + " " + itemName + "(s) at " + itemPrice + " each.");
        System.out.println("Amount due is " + amountDue);
    }
}

public class Purchasing{
    public static void main(String[] args) {

        PurchaseItem purchaseItem = new PurchaseItem();
        purchaseItem.readInput();
        purchaseItem.setTotalCost(purchaseItem.itemQuantity, purchaseItem.itemPrice);
        purchaseItem.writeOutput();
    }
}

