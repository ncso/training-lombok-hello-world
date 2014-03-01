
package com.acme.labs;

import com.acme.log.Log;
import com.acme.log.Logger;

public class Application {
    private static final Logger LOG = Log.getLogger(Application.class);
    public static void main(String[] args) {
        LOG.debug("hello world!");

        Mountain01 m01 = new Mountain01();
        LOG.debug("m01: [" + m01 + "]: " + m01.getName());

        Mountain02 m02 = new Mountain02("Mont Blanc", 6.8, 45.8);
        LOG.debug("m02: [" + m02 + "]: " + m02.getName());

        Mountain03 m03 = new Mountain03("Mont Blanc", 6.8, 45.8);
        LOG.debug("m03: [" + m03 + "]: " + m03.getName());
    }
}
