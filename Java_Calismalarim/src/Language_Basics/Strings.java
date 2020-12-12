package Language_Basics;

public class Strings {
    public static void main(String[] args) {

        char[] char_array = {'M','e','r','h','a','b','a'};
        System.out.println(new String(char_array));

        String name= "Ahmet AKAN";
        System.out.println(name.charAt(9));
        System.out.println(name.substring(6));
        System.out.println(name.toUpperCase());
        System.out.println(name.replace('A','B'));
        System.out.println(name.equals("b"));
        String[] words=name.split(" ");
        System.out.println(words[0]+" ve "+words[1]);
    }
}
