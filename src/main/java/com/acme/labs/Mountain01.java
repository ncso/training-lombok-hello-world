
/* minimal class
 */

package com.acme.labs;

public class Mountain01 {
    private final String name;
    private final double latitude, longitude;
    private String country;

    Mountain01() {
        name = "Mont Blanc";
        latitude = 6.8;
        longitude = 45.8;
    }

    String getName() { return name; }
}
