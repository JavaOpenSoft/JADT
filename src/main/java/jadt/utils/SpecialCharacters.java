package jadt.utils;

public class SpecialCharacters {

    public static final char squareRoot = '√';
    public static final char tilde = '~';
    public static final char backQuote = '`';
    public static final char theta = 'θ';
    public static final char beta = 'γ';
    public static final char sigma = 'Σ';
    public static final char psi  = 'Ψ';
    public static final char phi = 'φ';

    private final Emoji emoji = new Emoji();
    public Emoji getEmoji(){
        return emoji;
    }

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
}
class Emoji {
    Emoji(){

    }
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
    public static final String sadFaceSweating = "😓";
    public static final String openHands = "🤗";
    public static final String thinkingFace = "🤔";
    public static final String peeking = "🤔";
    public static final String blushingCoveringMouth = "🤭";
    public static final String coveringMouth = "🫢";
    public static final String saluting = "🫡";
    public static final String sushhhh = "🤫";
    public static final String meltingFace = "🫠";
    public static final String lyingFace = "🤥";
    public static final String mouthlessFace = "😶";
    public static final String dottedEmoji = "🫥";
    public static final String neutralFace = "😐";
    public static final String confused = "🫤";
    public static final String expressionlessFace = "😑";
    public static final String chatteringTeeth = "😬";
    public static final String rollingEyes = "🙄";
    public static final String surprisedFace = "😯";
    public static final String frowningFaceWithOPenMouth = "😦";
    public static final String anguishedFace = "😧";
    public static final String surprisedFaceWithOpenMouth = "😮";
    public static final String astonishedFace = "😲";
    public static final String yawning = "🥱";
    public static final String sleeping = "😴";
    public static final String drooling ="🤤";
    public static final String sleepyFace = "😪";
    public static final String exhaling = "😮‍💨";
    public static final String deadFace = "😵";
    public static final String dizzyFace = "😵‍💫";
    public static final String zippedMouth = "🤐";
    public static final String woozyFace = "🥴";
    public static final String nauseatedFace = "🤢";
    public static final String vomiting = "🤮";
    public static final String sneezing = "🤧";
    public static final String maskedFace = "😷";
    public static final String fever = "🤒";
    public static final String injuredFace = "🤕";
    public static final String moneyMouthFace = "🤑";
    public static final String cowboy = "🤠";
    public static final String smilingDevil = "😈";
    public static final String angryDevil = "👿";
    public static String getAllEmojis(){
        return smileyFace+
        smileyFaceWithBigEyes+
        smileyFaceWithSmilingEyes+
        beamingFaceWithSmilingEyes+
        laughing+
        smilingFaceHoldingBackTears +
        sweatingWithSmileyFace +
        joy +
        rofl +
        smileyFaceWithTear +
        blushingFace+
        smilingBlushingFace+
        angelEmoji+
         happyFace+
         upsideDownHappyFace+
         winkingFace+
         relievedFace+
         smileyFaceWithHeartEyes+
         faceWithHearts+
         kiss +
         kissingWithOpenEyes+
         whistling +
         kissingBlushingFace+
         lickingLips+
         tongueStickingOut+
         squintingFaceWithSquintingEyes+
         tongueStickingOutAndWinking+
         goofyFace+
         raisedEyebrow +
         faceWithMonocle+
         nerd+
         faceWithSunglasses+
         misterFace+
         wowingFace+
         celebratoryFace+
         smirking+
         unAmusedFace+
         disappointedFace+
         sadPensiveFace+
         worriedFace +
         confusedFace +
         sadFace +
         frowningFace+
         preservingFace+
         confounded +
         distraughtFace +
         wearyFace +
         pleadingFace +
         crying2 +
         sobbing +
         grumpyFace +
         angry +
         redAngryFace +
         redAngryFaceSwearing+
         mindExploded +
         flushed +
         hotFace +
         coldFace +
         screamingFace +
         fearfulFace +
         anxiousFace +
         sadRelievedFace +
         sadFaceSweating +
         openHands +
         thinkingFace +
         peeking +
         blushingCoveringMouth +
         coveringMouth +
         saluting +
         sushhhh +
         meltingFace +
         lyingFace +
         mouthlessFace +
         dottedEmoji +
         neutralFace +
         confused +
         expressionlessFace +
         chatteringTeeth +
         rollingEyes +
         surprisedFace +
         frowningFaceWithOPenMouth +
         anguishedFace +
         surprisedFaceWithOpenMouth +
         astonishedFace +
         yawning +
         sleeping+
         drooling +
         sleepyFace +
         exhaling +
         deadFace +
         dizzyFace +
         zippedMouth+
         woozyFace+
         nauseatedFace +
         vomiting +
         sneezing +
         maskedFace +
         fever +
         injuredFace +
         moneyMouthFace +
         cowboy +
         smilingDevil+
         angryDevil;
    }
}
