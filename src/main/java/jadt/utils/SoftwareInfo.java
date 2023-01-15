package jadt.utils;
@SuppressWarnings("all")
public class SoftwareInfo {
    private static final String About = "App development made easy with Java Application Development Toolkit(JADT)";
    private static final String Version = "1.0_rc6";
    private static final String BuildDate = "02/10/2022";
    private static final String buildStage = "Release Candidate Build";
    private static final String[] windowsVersions = {"Windows 11", "Windows 8", "Windows 8.1", "Windows 7"};
    public static String getOS(){
        String os = System.getProperty("os.name");
        for(int i = 0; i < windowsVersions.length; i++){
            if (os.equals(windowsVersions[i])) {
                os = "Windows";
                break;
            }
        }
        if(!os.equals("Windows"))System.err.println("Unknown OS: " + os);
        return os;
    }
    public static String getOSVersion() {
        return System.getProperty("os.version");
    }
    public static String getVersion(){
        return Version;
    }

    public static String getAbout() {
        return About;
    }

    public static String getBuildDate() {
        return BuildDate;
    }
}
