package Assignment4;

public class Question39_sort_form {
    public static void initials () {
        String name = "Ram Kishore singh";
        System.out.println("The full name is: " +name);
        System.out.println("Initials with surname  is ");
        int len = name.length();
        name = name.trim();
        String string1 = "";
        for (int i = 0; i < len; i++) {
            char ch = name.charAt(i);
            if (ch != ' ') {
                string1 = string1 + ch;
            } else {
                System.out.print(Character.toUpperCase(string1.charAt(0)) + ". ");
                string1 = "";
            }
        }
        String string2 = "";
        for (int j = 0; j < string1.length(); j++) {
            if (j == 0)
                string2 = string2 + Character.toUpperCase(string1.charAt(0));
            else
                string2 = string2 + Character.toLowerCase(string1.charAt(j));
        }
        System.out.println(string2);
    }
    public static void main (String[] args){
        initials();


    }
}
