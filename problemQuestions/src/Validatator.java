import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by tracxn-lp-175 on 25/9/17.
 */
public class Validatator {

    private String message;
    private String trimmedMessage;

    public Validatator (String message) {
        this.message = message;
        this.trimmedMessage = trimDummyData(this.message);
    }

    public Boolean validate() {
        Boolean result1 = validateAllUseCases(this.message);
        Boolean result2 = validateAllUseCases(this.trimmedMessage);
        if (result1 && result2) {
            return true;
        }
        return false;
    }

    public Boolean validateAllUseCases(String message) {
        int i =0;
        while(i <= 4) {
            Boolean result = validateUseCase(i, message);
            if (!result) {
                return false;
            }
            i++;
        }
        return true;
    }

    public Boolean validateUseCase(Integer usecase, String message) {
        Boolean result = false;
        switch(usecase) {
            case 1:
                if (validateCharacterTypes(message) && validateCharacterCount(message)) {
                    result =  true;
                }
                break;
            case 2:
                if (validateWordIncrementCount(message)) {
                    result = true;
                }
                break;
            case 3:
                if (validateFirstLetterForZero(message)) {
                    result = true;
                }
                break;
            case 4:
                if (validateForMaxValue(message)) {
                    result = true;
                }
                break;
            default:
                result = false;
        }
        return result;
    }

    public Boolean validateCharacterTypes(String message) {
        String regex = "\\d+|\\.+";
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(message);
        if (m.matches()) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean validateCharacterCount(String message) {
        if (message.length() >= 2) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean validateWordIncrementCount(String message) {
        Integer len2 = 0;
        String[] words = message.split("\\.");
        for(int i=0; i < words.length; i++) {
            Integer len1 = words[i].length();
            if (len2 == 0 || len1-len2 == 2 || (i ==  words.length-1)) {
                len2 = len1;
            } else  {
                return false;
            }
        }
        return true;
    }

    public Boolean validateFirstLetterForZero(String message) {
        String[] words = message.split("\\.");
        for(int i=0; i < words.length; i++) {
            if (words[i].charAt(0) == '0') {
                return false;
            }
        }
        return true;
    }

    public Boolean validateForMaxValue(String message) {
        String[] words = message.split("\\.");
        for(int i=0; i < words.length; i++) {
            Integer len = words[i].length();
            int j = 0;
            String maxNumber = "";
            while(j < len){
                maxNumber = maxNumber + "9";
                j++;
            }
            Double maxPossibleValue = 0.66 * Double.parseDouble(maxNumber);
            if (Double.parseDouble(words[i]) > maxPossibleValue) {
                return false;
            }
        }
        return true;
    }

    public String trimDummyData(String message) {
//        String[] words = message.split("\\.");
//        String[] updatedWords = new String[words.length];
//        for(int i =0; i< words.length; i++) {
//            int lastIndx = words[i].length()-1;
//            int previousDigit = Integer.parseInt(String.valueOf(words[i].charAt(lastIndx)));
//            int n = 0;
//            for(int j=lastIndx; j >= 0 ; j--) {
//                if(j == lastIndx || j - previousDigit == 2) {
//                    previousDigit = j;
//                    n+=1;
//                } else {
//                    break;
//                }
//                if (n >= 3) {
//                    updatedWords[i] = words[i].substring(0, words[i].length() - n);
//                } else {
//                    updatedWords[i] = words[i];
//                }
//            }
//        }
//        String messageWithoutDummyData = String.join(",", updatedWords);
//        return  messageWithoutDummyData;
        return "";
    }
}
