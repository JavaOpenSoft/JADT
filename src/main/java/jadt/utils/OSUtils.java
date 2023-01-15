package jadt.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

@SuppressWarnings("unused")
@Deprecated
public class OSUtils {

    @SuppressWarnings("unused")
    public enum OS {
        WINDOWS,
        UNIX,
        POSIX_UNIX,
        MAC,
        OTHER;

        private static String version;

        public static String getVersion() {
            return version;
        }

        @SuppressWarnings("static-access")
		private void setVersion(String version) {
            this.version = version;
        }
    }

    @SuppressWarnings("CanBeFinal")
    private static OS os = null;

    static {
        try {
            String osName = System.getProperty("os.name");
            if (osName == null) {
                throw new IOException("Cannot Get The Operating System Because The Variable Is Null.");
            }
            osName = osName.toLowerCase(Locale.ENGLISH);
            if (osName.contains("windows")) {
                os = OS.WINDOWS;
            } else if (osName.contains("linux")
                    || osName.contains("mpe/ix")
                    || osName.contains("freebsd")
                    || osName.contains("irix")
                    || osName.contains("digital unix")
                    || osName.contains("unix")) {
                os = OS.UNIX;
            } else if (osName.contains("mac os")) {
                os = OS.MAC;
            } else if (osName.contains("sun os")
                    || osName.contains("sunos")
                    || osName.contains("solaris")) {
                os = OS.POSIX_UNIX;
            } else if (osName.contains("hp-ux") 
                    || osName.contains("aix")) {
                os = OS.POSIX_UNIX;
            } else {
                os = OS.OTHER;
            }

        } catch (Exception ex) {
            os = OS.OTHER;
        } finally {
            os.setVersion(System.getProperty("os.version"));
        }
    }

    public static OS getOs() {
        return os;
    }
    @SuppressWarnings("unused")
    public String getOSWithVersion()
    {
    	String osWithVersion = (getOs()+" " + OS.getVersion()).trim();
    	osWithVersion = osWithVersion.toLowerCase(Locale.ENGLISH);
    	return osWithVersion;
    }
    public String[] getLinuxDistributionInformation(){
        String[] cmd = {
                "/bin/sh", "-c", "cat /etc/*-release" };
        String[] info = new String[3];
        try {
            Process process = Runtime.getRuntime().exec(cmd);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
                    process.getInputStream()));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                int i = 0;
                info[i] = line;
                //noinspection UnusedAssignment
                i++;
            }
        } catch (IOException e) {

            e.printStackTrace();
        }
        return info;
    }
    
}

