package com.jimmy.mvpcacheproxy.proxy;


/**
 * @author yangyoujun
 */
class MVPCacheProxyInternal extends AbsCacheProxy {

    private MVPCacheProxyInternal() {
    }

    @Override
    protected void onDestroy() {

    }

    static AbsCacheProxy create() {
        return new MVPCacheProxyInternal();
    }
}
