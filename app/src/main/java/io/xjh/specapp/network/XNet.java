package io.xjh.specapp.network;

/**
 * Created by xujianhua on 26/04/17.
 */

public class XNet {
    public static XNet Net;

    private Net mNet;
    public static synchronized XNet getInstance() {
        if (Net == null){
            Net = new XNet();
        }

        return Net;
    }

    private XNet() {
        mNet = new NetImpl();
    }

    public void init(){
        mNet.init();
    }
}
