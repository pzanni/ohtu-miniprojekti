package ohtu.utilities;

public class Encode {
    private static String[] conversions = {
        "ä", "\\\"{a}",
        "Ä", "\\\"{A}",
        "ö", "\\\"{o}",
        "Ö", "\\\"{O}",
    };

    public static String toBibTex(String text) {
        try {
            text = new String(text.getBytes("UTF-8"), "ISO-8859-1");
        } catch (Exception e) {}
        for (int i = 0; i < conversions.length; i += 2) {
            text = text.replace(conversions[i], conversions[i + 1]);
        }
        return text;
    }
}