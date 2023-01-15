package jadt.utils;

import java.net.URI;
import java.net.URISyntaxException;

public class RuntimeUtils {
    public static URI getRunningClassPathURI(Object object) throws URISyntaxException {
        return object.getClass().getProtectionDomain().getCodeSource().getLocation()
                .toURI();
    }
}
