package jadt.templates.info;
@SuppressWarnings("all")
public class SoftwareInfo {
    private final String About = "Templates Plugin for JUIT. Contains templates for commonly designed apps.";
    private final String Version = "1.0_rc6";
    private final String BuildDate = "02/10/2022";
    private static final String buildStage = "Release Candidate Build";
    private static final String[] windowsVersions = {"Windows 11", "Windows 8", "Windows 8.1", "Windows 7"};
    public static String getOS(){
        String os = System.getProperty("os.name");
        for (String windowsVersion : windowsVersions) {
            if (os.equals(windowsVersion)) {
                os = "Windows";
                break;
            }
        }
        return os;
    }
    public String getOSVersion() {
        return System.getProperty("os.version");
    }
    public String getVersion(){
        return Version;
    }

    public String getAbout() {
        return About;
    }

    public String getBuildDate() {
        return BuildDate;
    }
}
