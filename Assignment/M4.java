package Assignment;



public class M4 {
    public static void main(String[] args) {
        String rawCode1 = " pen2026004251 ";
        String rawCode2 = "12N2026004251";
        System.out.println(validateAndFormat(normalizeCode(rawCode1)));
        System.out.println(validateAndFormat(normalizeCode(rawCode2)));
    }

    static String normalizeCode(String raw) {
        String trimmed = raw.trim();
        String upper = trimmed.substring(0, 3).toUpperCase() + trimmed.substring(3);
        return upper;
    }

    static String validateAndFormat(String code) {
        if (code.length() != 13) {
            return "Invalid: wrong length";
        }
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid: publisher code must be 3 letters";
            }
        }
        for (int i = 3; i < 13; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid: body must be 10 digits";
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(code.substring(0, 3)).append("] YEAR: ").append(code.substring(3, 7)).append(" | CATALOG: ").append(code.substring(7, 13));
        return sb.toString();
    }
}
