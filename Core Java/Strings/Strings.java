public class Strings {
    public static void main(String[] args) {
        
        String name = "Bob";
        name = "Hello" + " Bob";
        // it doesn't change the original value of the string
        // actually, it creates a copy with the new value
        // because strings are immutable/constant

        String name_2 = " Paul";
        String name_3 = "Paul";
        // both are linked to the same address in memory

        StringBuffer sb = new StringBuffer("Test");
        // strings can be muttable with StringBuffer/StringBuilder

        sb.append(" Test2");

        System.out.println(name_2.equals(name_3));
        System.out.println(name_2.endsWith("ul"));
        System.out.println(name_2.matches("^[a-zA-Z]+$"));
        System.out.println(name_2.replace("P", "p"));
        System.out.println(name_2.trim());
    }
}