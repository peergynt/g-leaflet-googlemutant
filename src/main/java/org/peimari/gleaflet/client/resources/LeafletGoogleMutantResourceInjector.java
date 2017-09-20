package org.peimari.gleaflet.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.ScriptInjector;

public class LeafletGoogleMutantResourceInjector {

    protected static LeafletGoogleMutantClientBundle bundle;

    public static void ensureInjected() {
        if (bundle == null) {
            LeafletResourceInjector.ensureInjected();
            bundle = GWT.create(LeafletGoogleMutantClientBundle.class);
            LeafletGoogleMutantResourceInjector injector = GWT
                    .create(LeafletGoogleMutantResourceInjector.class);
            injector.injectResources();
        }
    }

    /**
     * Override this with deferred binding to customize injected stuff
     */
    protected void injectResources() {
        final String googleMutantText = bundle.googleMutantScript().getText();
        ScriptInjector.fromString(googleMutantText).setWindow(nativeTopWindow()).inject();
    }

    private static native void injectScript(String script)
	/*-{
	    $wnd.eval(script);
	}-*/;

    private static native JavaScriptObject nativeTopWindow()
    /*-{
        return $wnd;
    }-*/;
}
