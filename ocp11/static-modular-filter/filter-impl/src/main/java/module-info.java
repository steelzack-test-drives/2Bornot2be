module filter.impl {
    exports org.jesperancinha.ocp11.staticmodular.filter.impl;
    requires api;
    provides org.jesperancinha.ocp11.staticmodular.api.Filter with org.jesperancinha.ocp11.staticmodular.filter.impl.GreatFilterImpl;
}