package jadt.utils;
/**
 * The class which can give platform information like OS version,
 * **/
public class Platform {
    /**
     * Returns the type of platform the system is running (macOS, Windows, Linux)
     *
     **/
    public static String getPlatform(){
        String platform = System.getProperty("os.name");
        if(platform.contains("Windows")){
            return "Windows";
        }
        else if(platform.equals("Mac OS X")){
            if(getOSVersion().startsWith("10"))return "Mac OS X";
            else return "macOS";
        }
        else return "Linux";
    }
    public static void getLinuxDistributionName(){}
    public static void getLinuxDistributionVersion(){}
    public static String getHomeDirectory(){
        return System.getProperty("user.home");
    }
    /**
     * Returns the **/
    public static String getOSVersion(){
        return System.getProperty("os.version");
    }
    public static String getAppDataDirectory(){
        var os = Platform.getPlatform();
        if(isMac()){
            return getHomeDirectory() + "/Library/Application Support";
        }

        else if(isLinux()){
            System.err.println("getAppDataDirectory() is not supported on linux.use getLinuxAppDataDirectory() instead");
        }
        else if(isWindows()){
            return getHomeDirectory() + "\\AppData";
        }
        return null;
    }
    public static String getJVMUArchitecture(){
        return System.getProperty("os.arch");
    }
    public static boolean isMac(){
        return (getPlatform().equals("macOS") || getPlatform().equals("Mac OS X"));
    }
    public static boolean isWindows(){
        return (getPlatform().equals("windows"));
    }
    public static boolean isLinux(){
        return (getPlatform().equals("Linux"));
    }
}
