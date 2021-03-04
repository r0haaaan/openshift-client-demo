package io.fabric8.demo;

import io.fabric8.openshift.client.DefaultOpenShiftClient;
import io.fabric8.openshift.client.OpenShiftClient;

public class OpenShiftStartBuild {
    public static void main(String[] args) {
        try (OpenShiftClient client = new DefaultOpenShiftClient()) {
//            BuildConfig buildConfig = new BuildConfigBuilder()
//                    .withNewMetadata().withName("ruby-hello-world").endMetadata()
//                    .withNewSpec()
//                    .withNewOutput()
//                    .withNewTo()
//                    .withKind("ImageStreamTag")
//                    .withName("ruby-hello-world:latest")
//                    .endTo()
//                    .endOutput()
//                    .withNewStrategy()
//                    .withType("Docker")
//                    .withNewDockerStrategy()
//                    .withNewFrom()
//                    .withKind("ImageStreamTag")
//                    .withName("ruby-25-centos7:latest")
//                    .endFrom()
//                    .endDockerStrategy()
//                    .endStrategy()
//                    .withNewSource()
//                    .withType("Git")
//                    .withNewGit()
//                    .withUri("https://github.com/openshift/ruby-hello-world")
//                    .endGit()
//                    .endSource()
//                    .addNewTrigger()
//                    .withType("ConfigChange")
//                    .endTrigger()
//                    .endSpec()
//                    .build();
//            client.buildConfigs().inNamespace("rokumar-code").createOrReplace(buildConfig);
//
//            ImageStream is = new ImageStreamBuilder()
//                    .withNewMetadata().withName("ruby-25-centos7").endMetadata()
//                    .withNewSpec()
//                    .withNewLookupPolicy()
//                    .withLocal(true)
//                    .endLookupPolicy()
//                    .endSpec()
//                    .build();
//
//            client.imageStreams().inNamespace("rokumar-code").createOrReplace(is);
//
//            ImageStreamTag isTag = new ImageStreamTagBuilder()
//                    .withNewMetadata().withName("ruby-25-centos7:latest").endMetadata()
//                    .withNewTag()
//                    .withName("latest")
//                    .withNewFrom()
//                    .withKind("DockerImage")
//                    .withName("centos/ruby-25-centos7")
//                    .endFrom()
//                    .endTag()
//                    .withGeneration(0L)
//                    .withNewLookupPolicy().withLocal(false).endLookupPolicy()
//                    .build();
//            client.imageStreamTags().inNamespace("rokumar-code").createOrReplace(isTag);

            String namespace = "myproject";
            client.load(OpenShiftStartBuild.class.getResourceAsStream("/ruby-hello-world-new-app.json")).inNamespace(namespace).createOrReplace();

//            Build build = client.buildConfigs().inNamespace(namespace).withName("ruby-hello-world")
//                    .instantiate(new BuildRequestBuilder()
//                            .withNewMetadata().withName("ruby-hello-world").endMetadata()
//                            .build());
//            System.out.println(build.getMetadata().getName() + " started");
        }
    }
}
