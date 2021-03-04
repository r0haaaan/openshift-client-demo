package io.fabric8.demo;

import io.fabric8.openshift.api.model.operatorhub.v1alpha1.ClusterServiceVersion;
import io.fabric8.openshift.client.DefaultOpenShiftClient;
import io.fabric8.openshift.client.OpenShiftClient;

public class ClusterServiceVersionTesting {
    public static void main(String[] args) {
        try (OpenShiftClient client = new DefaultOpenShiftClient()) {
            ClusterServiceVersion csv = client.operatorHub().clusterServiceVersions()
                    .load(ClusterServiceVersionTesting.class.getResourceAsStream("/clusterserviceversion.yml"))
                    .get();
        }
    }
}
