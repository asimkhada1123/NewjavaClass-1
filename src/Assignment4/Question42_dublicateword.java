package Assignment4;

public class Question42_dublicateword {
    public static void dupword(String str1)
    {
        int count;

        //Converts the string into lowercase
        str1 = str1.toLowerCase();

        //Split the string into words using built-in function
        String[] words = str1.split(" ");

        System.out.println("Duplicate words in a given string : ");
        for(int i = 0; i < words.length; i++) {
            count = 1;
            for(int j = i+1; j < words.length; j++) {
                if(words[i].equals(words[j])) {
                    count++;
                    //Set words[j] to 0 to avoid printing visited word
                    words[j] = "0";
                }
            }
            //Displays the duplicate word if count is greater than 1
            if(count > 1 && words[i] != "0")
                System.out.println(words[i]);
        }
    }
    public static void main (String[] args){
       dupword("cat rat cat bat sat fat sat");


    }
}
