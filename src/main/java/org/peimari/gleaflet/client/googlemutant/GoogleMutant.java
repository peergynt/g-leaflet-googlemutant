package org.peimari.gleaflet.client.googlemutant;

import org.peimari.gleaflet.client.GridLayer;
import org.peimari.gleaflet.client.resources.LeafletGoogleMutantResourceInjector;

public class GoogleMutant extends GridLayer {

    static {
        LeafletGoogleMutantResourceInjector.ensureInjected();
    }

    protected GoogleMutant() {}

    public static native GoogleMutant create(GoogleMutantOptions options)
    /*-{
        return new $wnd.L.gridLayer.googleMutant(options);
    }-*/;
}
