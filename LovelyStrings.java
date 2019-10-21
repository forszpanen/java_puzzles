public class LovelyStrings {
 
    public static void main(String[] args) {
        String[] words = {"I ", "love ", "the ", "String ", "class!"};
        String statement = null;
        for (String word : words) {
            statement += word;
        }
        System.out.println(statement);
    }
}