import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author aziarkash
 *
 */
public final class Application {

    public Application() {

        printHeader(); // Print the header

        manipulateStrings(); // Create and manipulate Strings

        manipulateStringBuilder(); // Manipulate data using the StringBuilder class and its methods

        createOneDimArray(); // Declare, Instantiate, Initialize and use a one-dimensional array

        createTwoDimArray(); // Declare, Instantiate, Initialize and use a two-dimensional array

        createArrayList(); // Declare and use an ArrayList

        useEncapsulation(); // Use Encapsulation for Reference Variables
    }

    public void printHeader() {
        System.out.println("OCA Chapter 5 Demo\n\nChapter Objectives:");
        addSeperatorLine();
        System.out.println("-   Create and manipulate Strings");
        System.out.println("-   Manipulate data using the StringBuilder class and its methods");
        System.out.println("-   Declare, Instantiate, Initialize and use a one-dimensional array");
        System.out.println("-   Declare, Instantiate, Initialize and use a two-dimensional array");
        System.out.println("-   Declare and use an ArrayList");
        System.out.println("-   Use Encapsulation for Reference Variables");
        addSeperatorLine();
        System.out.println();
    }

    public void manipulateStrings() {
        System.out.println("String Class");
        addSeperatorLine();

        String myName = new String();
        myName = "xmin ";
        myName = myName.concat("ziarkasy");
        myName = myName.toUpperCase();
        System.out.println("my name (spelled wrong)\t\t:\t" + myName);

        final char a = myName.charAt(0);
        final char b = myName.charAt(1);
        final char c = myName.charAt(2);
        final char d = myName.charAt(3);
        System.out.println("backwards firstname\t\t:\t" + d + c + b + a);
        
        final int x = myName.length();
        System.out.println("my name length\t\t\t:\t" + x);

        final char firstChar = myName.charAt(0);
        final char lastChar = myName.charAt(12);
        myName = myName.replace(firstChar, 'A');
        myName = myName.replace(lastChar, 'H');
        System.out.println("replaced wrong chars\t\t:\t" + myName);
        System.out.println("name to lowercase\t\t:\t" + myName.toLowerCase());

        addSeperatorLine();
    }

    public void manipulateStringBuilder() {
        System.out.println("\nStringBuilder Class");
        addSeperatorLine();

        final StringBuilder sb = new StringBuilder("abc");
        System.out.println("actual string\t\t\t:\t" + sb);

        sb.append("def");
        System.out.println("append the string with'def'\t:\t" + sb);

        sb.insert(3, "---");
        System.out.println("insert '---' between strings\t:\t" + sb);

        sb.reverse();
        System.out.println("reversed the string\t\t:\t" + sb);

        sb.delete(3, 6);
        System.out.println("deleted the '---'\t\t:\t" + sb);
        System.out.println("reversed back to normal\t\t:\t" + sb.reverse());

        sb.insert(6, 'g');
        System.out.println("inserted another char\t\t:\t" + sb);

        addSeperatorLine();
    }

    public void createOneDimArray() {
        System.out.println("\nOne-Dimensional Array");
        addSeperatorLine();
        displayOneDimArray();
        addSeperatorLine();
    }

    public void displayOneDimArray() {
        final String[] roleNames = {"Java Developer", "Data Scientist", "C++ Developer"};
        for (int row = 0; row < roleNames.length; row++) {
            System.out.println("role name\t\t\t:\t" + roleNames[row]);
        }
    }

    public void createTwoDimArray() {
        System.out.println("\nTwo-Dimensional Array");
        addSeperatorLine();

        final String[][] twoDimArray = new String[3][]; // Constructing a Two-Dimensional array with 3 rows
        twoDimArray[0] = new String[2];
        twoDimArray[0][0] = "a";
        twoDimArray[0][1] = "b";
        twoDimArray[1] = new String[3];
        twoDimArray[1][0] = "c";
        twoDimArray[1][1] = "d";
        twoDimArray[1][2] = "e";
        twoDimArray[2] = new String[1];
        twoDimArray[2][0] = "f";
        displayTwoDimArray(twoDimArray);

        addSeperatorLine();
    }

    public void displayTwoDimArray(final String[][] x) {
        for (int row = 0; row < x.length; row++) {
            for (int column = 0; column < x[row].length; column++) {
                System.out.print(x[row][column] + "\t");
            }
            System.out.println();
        }
    }

    public void createArrayList() {
        System.out.println("\nArrayList Class");
        addSeperatorLine();

        final List<String> list = new ArrayList<String>();
        list.add("Paris");
        list.add("London");
        list.add("Amsterdam");
        System.out.println("list of cities\t\t\t:\t" + list);

        final int index = list.indexOf("London");
        System.out.println("The index of 'London' is\t:\t" + index);

        list.add(index, "New York");
        System.out.println("added another city at index 1\t:\t" + list);

        list.clear();
        System.out.println("cleared the list (empty)\t:\t" + list);

        list.add("Den Haag");
        list.add("Rijswijk");
        list.add("Rotterdam");
        System.out.println("populated with some cities\t:\t" + list);

        final String secondIndex = list.get(1);
        System.out.println("get second city from the list\t:\t[" + secondIndex + "]");

        list.remove(2);
        System.out.println("removed last city on the list\t:\t" + list);

        addSeperatorLine();
    }

    public void useEncapsulation() {
        System.out.println("\nEncapsulating reference variables");
        addSeperatorLine();

        final Employee employee = new Employee();
        StringBuilder sbObject = employee.getName(); // Different ID
        sbObject.append("Some more text");
        employee.printName();

        addSeperatorLine();
    }

    public void addSeperatorLine() {
        System.out.println(
            "--------------------------------------------------------------------------------------------------------");
    }
}
