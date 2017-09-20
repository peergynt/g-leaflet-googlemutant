package org.peimari.gleaflet.client.googlemutant;

import com.google.gwt.core.client.JsArrayString;
import org.peimari.gleaflet.client.GridLayerOptions;

public class GoogleMutantOptions extends GridLayerOptions {

    protected GoogleMutantOptions() {}

    public static native GoogleMutantOptions create()
    /*-{
        return {};
    }-*/;

    public native final void setMinZoom(int minZoom)
	/*-{
		this.minZoom = minZoom;
	}-*/;

    public native final void setMaxZoom(int maxZoom)
	/*-{
		this.maxZoom = maxZoom;
	}-*/;

    public final void setSubDomains(String... subDomains) {
        JsArrayString domains = JsArrayString.createArray().cast();
        for (String a : subDomains) {
            domains.push(a);
        }
        setSubDomains(domains);
    }

    public native final void setSubDomains(JsArrayString subdomains)
	/*-{
		this.subdomains = subdomains;
	}-*/;

    public native final void setErrorTileUrl(String errorTileUrl)
	/*-{
		this.errorTileUrl = errorTileUrl;
	}-*/;

    public native final void setContinuousWorld(boolean continuousWorld)
	/*-{
		this.continuousWorld = continuousWorld;
	}-*/;

    public native final void setType(String type)
	/*-{
		this.type = type;
	}-*/;
}
