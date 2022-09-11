package jadt.utils;

public class SoftwareInfo {
    private final String About = "App development made easy";
    private final String Version = "1.0_rc4";
    private final String BuildDate = "2022.11.10";
    private final String[] windowsVersions = {"Windows 11", "Windows 8", "Windows 8.1", "Windows 7"};
    public String getOS(){
        String os = System.getProperty("os.name");
        for(int i = 0; i < windowsVersions.length; i++){
            if (os.equals(windowsVersions[i])) {
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
