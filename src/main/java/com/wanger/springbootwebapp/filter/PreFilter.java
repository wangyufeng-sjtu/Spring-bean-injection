package com.wanger.springbootwebapp.filter;

import javax.servlet.ReadListener;
import java.io.IOException;

/**
 * web filter
 *
 * @author wanger
 * @date 2020年 10月09日
 */
public class PreFilter implements ReadListener {
    @Override
    public void onDataAvailable() throws IOException {

    }

    @Override
    public void onAllDataRead() throws IOException {

    }

    @Override
    public void onError(Throwable throwable) {

    }
}
