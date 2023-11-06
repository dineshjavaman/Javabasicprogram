package Vowels;

public class VowelsController {
    public static void main(String[] args) {

        VowelService vowelService = new VowelService();

        Boolean prime = vowelService.checkVowel("dinesh");
        System.out.println(prime);
    }

}
