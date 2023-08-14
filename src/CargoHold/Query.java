package CargoHold;

import java.util.*;

public class Query {

    private Scanner scanner = new Scanner(System.in);
    private static int amountOfItems;
    private static int maximumWeight;
    private Suitcase suitcase;
    public Query() {}
    public void retrieveItemInfo() {
        int counter = 0;
        System.out.println("Amount of items?");
        amountOfItems = scanner.nextInt();
        System.out.println("Max weight?");
        maximumWeight = scanner.nextInt();
        while(counter < amountOfItems)
        {
            Item [] myItems = new Item[amountOfItems];
            for(int i = 0; i < amountOfItems; i++)
            {
                int totalWeight = 0;
                int index = i+1;
                System.out.println("Name of item " + index + " ? ");
                String nameOfItem = scanner.next();
                System.out.println("Weight of item " + index + " ? ");
                int weightOfItem = scanner.nextInt();
                myItems[i] = new Item(nameOfItem,weightOfItem);
                if(i == amountOfItems-1)
                {
                    for(int j = 0; j < amountOfItems; j++)
                    {
                        System.out.println(myItems[j]);
                        counter++;
                    }
                }
                totalWeight += myItems[i].getWeight();
                if(totalWeight > maximumWeight)
                {
                    break;
                }
                else
                {
                    suitcase.addItem(); // TODO: Add items to suitcase
                }

            }
        }
        System.out.println(suitcase);
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
}


/*





Program pattern:

list details with GUI window

ask if the user would like to complete purchase (if no, then either quit or restart)

turn into factory design?

 */

/*
int counter = 0;
        JOptionPane.showMessageDialog(null, "Welcome to Cargo Hold\nPress Ok", "Cargo Hold", JOptionPane.PLAIN_MESSAGE);
        while (counter < 3) {
            int amountOfItems = Integer.parseInt(JOptionPane.showInputDialog
                    (null, "How many items?", "Item Amount", JOptionPane.PLAIN_MESSAGE));
            Item [] myItems = new Item[amountOfItems];
            for(int i = 0; i < myItems.length; i++)
            {
                String itemName = JOptionPane.showInputDialog
                        (null, "Name of item? ", "Item Properties",
                                JOptionPane.INFORMATION_MESSAGE);
                int itemWeight = Integer.parseInt((JOptionPane.showInputDialog
                        (null, "Weight of item", "Item Properties",
                                JOptionPane.INFORMATION_MESSAGE)));
                if(itemName.isEmpty() || itemWeight < 0)
                {
                    String warningMessage = JOptionPane.showInputDialog
                        (null, "ERROR: Input appropriate values", "!WARNING!",
                                JOptionPane.WARNING_MESSAGE);
                }
                myItems[i] = new Item(itemName,itemWeight);
                counter++;
            }
            totalWeightOfCase = Integer.parseInt(JOptionPane.showInputDialog
                        (null,"Enter max weight for suitcase", "Case",
                                JOptionPane.INFORMATION_MESSAGE));
            JOptionPane.showMessageDialog
                        (null, "Making suitcase...", "Loading case",
                                JOptionPane.PLAIN_MESSAGE);
            suitcase.setMaxWeight(totalWeightOfCase);
            counter++;
            for(int i = 0; i <= myItems.length-1; i++)
            {
                int calcWeight = myItems[i].getWeight();
                if(calcWeight <= totalWeightOfCase)
                {
                    suitcase.addItem(myItems[i]);
                }
                else
                {
                    break;
                }
                calcWeight++;
                hold.addSuitcase(suitcase);
                hold.setMaxWeight(suitcase.totalWeight());
                counter++;
            }
            System.out.println(suitcase);
 */