package Vowels;

public class VowelService {


    public boolean checkVowel(String name) {

        for (int i = 0; i < name.length(); i++) {
            if (isaBoolean(name, i))
                return true;
        }

        return false;



    }

    private boolean isaBoolean(String name, int i) {
        return name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i'
                || name.charAt(i) == 'o' ||
                name.charAt(i) == 'u';
    }
}