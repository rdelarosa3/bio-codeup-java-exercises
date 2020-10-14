import java.util.*;
import util.Input;

public class GroceryList{
    // set hashmap as map to sort later
    private static final Map<String,ArrayList<GroceryItems>> groceryList = new HashMap<>();
    private static final ArrayList<String> categories = new ArrayList<>();

    public static void main(String[] args) {
        createCategories();
        System.out.print("Would you like to create a grocery list? ");
        boolean notFinalized = Input.yesNo();
        if(notFinalized)System.out.print("Add new Item to List? ");
        notFinalized = Input.yesNo();
        while(notFinalized){
            addItem(categorySelect());
            System.out.print("Add another Item? y-Continue/ n-Finalize ");
            notFinalized = Input.yesNo();
        }
        printGroceryList();

        System.out.print("\nView Menu Options?");
        if (Input.yesNo()){
            boolean quit = false;
            int choice = 0;
            while(!quit){
                printInstructions();
                System.out.println("Enter Your Choice: ");
                switch (Input.getInt(0,6)){
                    case 0:
                        printInstructions();
                        break;
                    case 1:
                        printGroceryList();
                        break;
                    case 2:
                        addItem(categorySelect());
                        break;
                    case 3:
                        updateItem(categorySelect());
                        break;
                    case 4:
                        removeItem(categorySelect());
                        break;
                    case 5:
                        searchItem();
                        break;
                    case 6:
                        quit = true;
                        break;
                }
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\n Press ");
        System.out.println("\t 0- To Print choice options");
        System.out.println("\t 1- To Print the list of items");
        System.out.println("\t 2- To add an item to the list");
        System.out.println("\t 3- To modify an item in the list");
        System.out.println("\t 4- To remove item from list");
        System.out.println("\t 5- To search for an item in the list");
        System.out.println("\t 6- To finalize list");
    }

    public static void createCategories(){
        categories.add("Beverage");
        categories.add("Bread");
        categories.add("Meat");
        categories.add("Produce");
        categories.add("Dairy");

        Collections.sort(categories);
        for (String c : categories ){
            groceryList.putIfAbsent(c,new ArrayList<>());
        }

    }

    public static String categorySelect(){
        int count = 0;
        TreeMap<String, ArrayList<GroceryItems>> sortedList = new TreeMap<>(groceryList);
        for (String k : sortedList.keySet()){
            System.out.printf("%d. %s%n",count,k);
            count++;
        }
        System.out.println("Select Category");
        return categories.get(Input.getInt(0,categories.size()-1));
    }
    public static void addItem(String category){
        System.out.printf("Enter %s Name: %n",category);
        String item = Input.getString();
        System.out.println("Enter Amount: ");
        int amount = Input.getInt();
        groceryList.get(category).add(new GroceryItems(item,amount));
    }

    public static void updateItem(String category){
        printTable(category);
        printSortedItems(groceryList.get(category));
        System.out.println("Enter Item to edit");
        for(GroceryItems item : groceryList.get(category)){
            if (item.getName().equalsIgnoreCase(Input.getString())){
                System.out.println("Update Name?");
                if(Input.yesNo()){
                    System.out.println("Please enter new name to update:");
                    item.setName(Input.getString());
                }
                System.out.println("Update Amount?");
                if(Input.yesNo()) {
                    System.out.println("Please enter new amount to update:");
                    item.setAmount(Input.getInt());
                }
                System.out.println("Update Completed");
            }else{
                System.out.println("Item not in list");
            }
        }
    }

    public static void removeItem(String category){
        printTable(category);
        printSortedItems(groceryList.get(category));
        System.out.println("Enter Item to remove");
/*      collections way of doing without for loop  */
//      groceryList.get(category).removeIf(item -> item.getName().equalsIgnoreCase(Input.getString()));
        for(GroceryItems item : groceryList.get(category)){
            if (item.getName().equalsIgnoreCase(Input.getString())){
                groceryList.get(category).remove(item);
                System.out.println("Item removed");
            }
        }
    }

    public static void printTable(String category){
        System.out.println("------------------");
        System.out.printf("%-18s%n",category);
        System.out.println("------------------");
        System.out.printf("%-9s","Item");
        System.out.printf("%-9s%n"," Amount");
        System.out.println("------------------");
    }
    public static void printGroceryList(){
        //  sort the hashmap
        TreeMap<String, ArrayList<GroceryItems>> sortedList = new TreeMap<>(groceryList);
        for ( String category : sortedList.keySet()){
            if(!sortedList.get(category).isEmpty()){
                printTable(category);
                printSortedItems(sortedList.get(category));
            }
        }
    }

    public static void printSortedItems(ArrayList<GroceryItems> items){
        /*  Clone list temporarily and compare object by property of name to print ascending */
        List<GroceryItems> sortedItems = new ArrayList<>(items);
        sortedItems.sort(Comparator.comparing(GroceryItems::getName));
        for (GroceryItems sortedItem : sortedItems) {
            String name = sortedItem.getName();
            int amount = sortedItem.getAmount();
            String str1 = String.format("%-8s", name);
            String str2 = String.format("%-3s", " | ");
            String str3 = String.format("%-7d", amount);
            System.out.println(str1 + str2 + str3);
        }
    }
    
    public static void searchItem(){
        System.out.println("Enter item to search for");
        String inputItem = Input.getString();
        int count = 0;
        TreeMap<String, ArrayList<GroceryItems>> sortedList = new TreeMap<>(groceryList);
        for ( String category : sortedList.keySet()){
            if(!sortedList.get(category).isEmpty()){
                if (containsName(sortedList.get(category),inputItem)){
                    printTable(category);
                    for (GroceryItems item : sortedList.get(category)) {
                        if(item.getName().equalsIgnoreCase(inputItem)){
                            String str1 = String.format("%-8s", item.getName());
                            String str2 = String.format("%-3s", " | ");
                            String str3 = String.format("%-7d", item.getAmount());
                            System.out.println(str1 + str2 + str3);
                            count++;
                        }
                    }
                }
            }
        }
        System.out.printf("%n%d items match your search%n",count);
    }

    public static boolean containsName(final List<GroceryItems> list, final String name){
        return list.stream().anyMatch(o -> o.getName().equals(name));
    }

}