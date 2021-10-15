package se.robinstrang;

public class StringUtils {
    public void Run(){
        System.out.print("Skriv in en text: ");
        String text = System.console().readLine();
        boolean sameChars = allCharsAreIdentical(text);
        System.out.println(sameChars);
    }
    public boolean allCharsAreIdentical(String text){
        for (int i = 0; i < text.length(); i++){
            if (text.charAt(0) != text.charAt(i)){
                return false;
            }
        }
        return true;
    }
}