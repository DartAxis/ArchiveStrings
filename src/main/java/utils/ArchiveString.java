package utils;

public class ArchiveString {

    public static String processString(String source) {

        if (source == null || source.isEmpty()) {
            return "Неверно переданная строка";
        }
        char[] chArr = source.toCharArray();
        StringBuilder resultBuilder = new StringBuilder();
        for (int i = 0; i < chArr.length; i++) {
            int count = 1;
            while ( i<chArr.length-1 && chArr[i] == chArr[i + 1]) {
                count++;
                if (i + 1 < (chArr.length)) {
                    i++;
                } else {
                    break;
                }
            }
            resultBuilder.append(count);
            resultBuilder.append(chArr[i]);
        }
        return resultBuilder.toString();
    }
}

