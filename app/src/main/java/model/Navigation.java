package model;

import androidx.annotation.NonNull;

public class Navigation {
    String NavIconName1;
    String NavIconName2;
    int NavThumb1;
    int NavThumb2;

    public Navigation(String navIconName1, String navIconName2, int navThumb1, int navThumb2) {
        NavIconName1 = navIconName1;
        NavIconName2 = navIconName2;
        NavThumb1 = navThumb1;
        NavThumb2 = navThumb2;
    }

    public String getNavIconName1() {
        return NavIconName1;
    }

    public void setNavIconName1(String navIconName1) {
        NavIconName1 = navIconName1;
    }

    public String getNavIconName2() {
        return NavIconName2;
    }

    public void setNavIconName2(String navIconName2) {
        NavIconName2 = navIconName2;
    }

    public int getNavThumb1() {
        return NavThumb1;
    }

    public void setNavThumb1(int navThumb1) {
        NavThumb1 = navThumb1;
    }

    public int getNavThumb2() {
        return NavThumb2;
    }

    public void setNavThumb2(int navThumb2) {
        NavThumb2 = navThumb2;
    }
}
