package com.keycloak.spi.metrics;

import org.keycloak.Config;
import org.keycloak.events.EventListenerProvider;
import org.keycloak.events.EventListenerProviderFactory;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;

public class MetricsEventListenerFactory implements EventListenerProviderFactory {

    private static final String METRICS_LISTENER_ID = "metrics-listener";

    @Override
    public EventListenerProvider create(KeycloakSession session) {
        return new MetricsEventListener();
    }

    @Override
    public void init(Config.Scope config) {
        // nothing to do
    }

    @Override
    public void postInit(KeycloakSessionFactory factory) {
        // nothing to do
    }

    @Override
    public void close() {
        // nothing to do
    }

    @Override
    public String getId() {
        return METRICS_LISTENER_ID;
    }
}
