package io.fabric8.demo;

//import io.fabric8.kubernetes.api.model.discovery.v1beta1.EndpointSlice;
//import io.fabric8.kubernetes.api.model.discovery.v1beta1.EndpointSliceBuilder;
import io.fabric8.openshift.client.DefaultOpenShiftClient;
import io.fabric8.openshift.client.OpenShiftClient;

public class OpenShiftEndpointSliceTest {
    public static void main(String[] args) {
        try (OpenShiftClient openShiftClient = new DefaultOpenShiftClient()) {

//            EndpointSlice endpointSlice = new EndpointSliceBuilder()
//                    .withNewMetadata()
//                    .withName("example-abc")
//                    .addToLabels("kubernetes.io/service-name", "example")
//                    .endMetadata()
//                    .withAddressType("IPv4")
//                    .addNewPort()
//                    .withName("http")
//                    .withPort(80)
//                    .endPort()
//                    .addNewEndpoint()
//                    .withAddresses("10.1.2.3")
//                    .withNewConditions().withReady(true).endConditions()
//                    .withHostname("pod-1")
//                    .addToTopology("kubernetes.io/hostname", "node-1")
//                    .addToTopology("topology.kubernetes.io/zone", "us-west2-a")
//                    .endEndpoint()
//                    .build();
//
//            openShiftClient.discovery().v1beta1().endpointSlices().inNamespace("default").createOrReplace(endpointSlice);
//            System.out.println("EndpointSlice created!");
//            openShiftClient.discovery().v1beta1().endpointSlices().inNamespace("default").withName(endpointSlice.getMetadata().getName()).delete();
//            System.out.println("EndpointSlice deleted!");

        }
    }
}
