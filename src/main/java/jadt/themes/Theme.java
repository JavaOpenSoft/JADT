package jadt.themes;

import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import com.jtattoo.plaf.aero.AeroLookAndFeel;
import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import com.jtattoo.plaf.graphite.GraphiteLookAndFeel;
import com.jtattoo.plaf.bernstein.BernsteinLookAndFeel;
import com.jtattoo.plaf.fast.FastLookAndFeel;
import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import com.jtattoo.plaf.luna.LunaLookAndFeel;
import com.jtattoo.plaf.mcwin.McWinLookAndFeel;
import com.jtattoo.plaf.mint.MintLookAndFeel;
import com.jtattoo.plaf.noire.NoireLookAndFeel;
import com.jtattoo.plaf.smart.SmartLookAndFeel;
import com.jtattoo.plaf.texture.TextureLookAndFeel;

import javax.swing.*;

public class Theme {

    private Theme(){

    }
    public static String getDefault(){
        return UIManager.getSystemLookAndFeelClassName();
    }
    public static GraphiteLookAndFeel getGraphiteTheme(){
        return new GraphiteLookAndFeel();
    }
    public static AeroLookAndFeel getAeroTheme(){
        return new AeroLookAndFeel();
    }
    public static AcrylLookAndFeel getAcrylTheme(){
        return new AcrylLookAndFeel();
    }
    public static AluminiumLookAndFeel getAluminiumTheme(){
        return new AluminiumLookAndFeel();
    }
    public static BernsteinLookAndFeel getGoldenTheme(){
        return new BernsteinLookAndFeel();
    }
    public static FastLookAndFeel getWindows10Theme(){
        return new FastLookAndFeel();
    }
    public static HiFiLookAndFeel getWindowsXP_BlackTheme() {
        return new HiFiLookAndFeel();
    }
    public static McWinLookAndFeel getMacOSX_AeroTheme() {
        return new McWinLookAndFeel();
    }
    public static MintLookAndFeel getMintTheme() {
        return new MintLookAndFeel();
    }
    public static NoireLookAndFeel getClassicBlackTheme() {
        return new NoireLookAndFeel();
    }
    public static SmartLookAndFeel getClassicAeroTheme() {
        return new SmartLookAndFeel();
    }
    public static LunaLookAndFeel getWindowsXPTheme() {
        return new LunaLookAndFeel();
    }
    public static TextureLookAndFeel getClassicUbuntuTheme() {
        return new TextureLookAndFeel();
    }

}
