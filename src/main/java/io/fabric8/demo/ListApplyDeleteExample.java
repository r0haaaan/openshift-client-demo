package io.fabric8.demo;

import io.fabric8.openshift.client.DefaultOpenShiftClient;
import io.fabric8.openshift.client.OpenShiftClient;

public class ListApplyDeleteExample {
    public static void main(String[] args) {
        try (OpenShiftClient client = new DefaultOpenShiftClient()) {
            client.load(ListApplyDeleteExample.class.getResourceAsStream("/test-list.yml")).inNamespace("rokumar").createOrReplace();

            client.load(ListApplyDeleteExample.class.getResourceAsStream("/test-list.yml")).inNamespace("rokumar").delete();
        }
    }
}
