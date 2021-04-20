package utils;

public class ArchiveString {

    private ArchiveString() {
    }

    public static String processString(String source) {
        if (source == null || source.isEmpty()) {
            return "Неверно переданная строка";
        }
        StringBuilder res = new StringBuilder();
        int count = 1;
        for (int i = 0; i < source.length(); i++) {
            char c1 = source.charAt(i);
            if (i + 1 < source.length()) {
                char c2 = source.charAt(i + 1);
                if (c1 == c2) {
                    count++;
                } else {
                    res.append(count).append(c1);
                    count = 1;
                }
            } else res.append(count).append(c1);
        }
        return res.toString();
    }
}

