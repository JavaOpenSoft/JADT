package jadt.utils;

public class TextUtils {
    //Special characters
    public static final String squareRoot = "√";
    public static final String tilde = "~";
    public static final String backQuote = "`";
    //Emoji characters
    public static final String smileyFace = "😀";
    public static final String smileyFaceWithBigEyes = "😃";
    public static final String smileyFaceWithSmilingEyes = "😄";
    public static final String beamingFaceWithSmilingEyes = "😁";
    public static final String laughing = "😆";
    public static final String smilingFaceHoldingBackTears = "🥹";
    public static final String sweatingWithSmileyFace = "😅";
    public static final String joy = "😂";
    public static final String rofl = "🤣";
    public static final String smileyFaceWithTear = "🥲";
    public static final String blushingFace = "☺️";
    public static final String smilingBlushingFace = "😊";
    public static final String angelEmoji = "😇";
    public static final String happyFace = "🙂";
    public static final String upsideDownHappyFace = "🙃";
    public static final String winkingFace = "😉";
    public static final String relievedFace = "😌";
    public static final String smileyFaceWithHeartEyes = "😍";
    public static final String faceWithHearts = "🥰";
    public static final String kiss = "😘";
    public static final String kissingWithOpenEyes = "😗";
    public static final String whistling = "😙";
    public static final String kissingBlushingFace = "😚";
    public static final String lickingLips = "😋";
    public static final String tongueStickingOut = "😛";
    public static final String squintingFaceWithSquintingEyes = "😝";
    public static final String tongueStickingOutAndWinking = "😜";
    public static final String goofyFace = "🤪";
    public static final String raisedEyebrow = "🤨";
    public static final String faceWithMonocle = "🧐";
    public static final String nerd = "🤓";
    public static final String faceWithSunglasses = "😎";
    public static final String misterFace = "🥸";
    public static final String wowingFace = "🤩";
    public static final String celebratoryFace = "🥳";
    public static final String smirking = "😏";
    public static final String unAmusedFace = "😒";
    public static final String disappointedFace = "😞";
    public static final String sadPensiveFace = "😔";
    public static final String worriedFace = "😟";
    public static final String confusedFace = "😕";
    public static final String sadFace = "🙁";
    public static final String frowningFace = "☹️";
    public static final String preservingFace = "😣";
    public static final String confounded = "😖";
    public static final String distraughtFace = "😫";
    public static final String wearyFace = "😩";
    public static final String pleadingFace = "🥺";
    public static final String crying2 = "😢";
    public static final String sobbing = "😭";
    public static final String grumpyFace = "😤";
    public static final String angry = "😠";
    public static final String redAngryFace = "😡";
    public static final String redAngryFaceSwearing = "🤬";
    public static final String mindExploded = "🤯";
    public static final String flushed = "😳";
    public static final String hotFace = "🥵";
    public static final String coldFace = "🥶";
    public static final String screamingFace = "😱";
    public static final String fearfulFace = "😰";
    public static final String anxiousFace = "😰";
    public static final String sadRelievedFace = "😥";

    public static String superscript(String inputString) {
        String str = "";
        str = str.replaceAll("0", "⁰");
        str = str.replaceAll("1", "¹");
        str = str.replaceAll("2", "²");
        str = str.replaceAll("3", "³");
        str = str.replaceAll("4", "⁴");
        str = str.replaceAll("5", "⁵");
        str = str.replaceAll("6", "⁶");
        str = str.replaceAll("7", "⁷");
        str = str.replaceAll("8", "⁸");
        str = str.replaceAll("9", "⁹");
        return str;
    }

    public static String subscript(String inputString) {
        String str = "";
        str = str.replaceAll("0", "₀");
        str = str.replaceAll("1", "₁");
        str = str.replaceAll("2", "₂");
        str = str.replaceAll("3", "₃");
        str = str.replaceAll("4", "₄");
        str = str.replaceAll("5", "₅");
        str = str.replaceAll("6", "₆");
        str = str.replaceAll("7", "₇");
        str = str.replaceAll("8", "₈");
        str = str.replaceAll("9", "₉");
        return str;
    }
    public String replaceAll(String str, String stringToReplace, String replacement){
        return new String(str).replaceAll(stringToReplace , replacement);
    }
}
