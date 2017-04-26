package io.xjh.specapp.network;

/**
 * Created by xujianhua on 2017/4/26.
 */

public class Xnet {
    private static Xnet xnet;

    public static Xnet getInstance(){
        if (xnet == null) {
            xnet = new Xnet();
        }
        return xnet;
    }


}
