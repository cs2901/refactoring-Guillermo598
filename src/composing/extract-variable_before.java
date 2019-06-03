void renderBanner() {
    final boolean MACExists = platform.toUpperCase().indexOf("MAC") > -1;
    final boolean IEExists = browser.toUpperCase().indexOf("IE") > -1;
    if (MACExists && IEExists && wasInitialized() && resize > 0) {
    // do something
    }
}