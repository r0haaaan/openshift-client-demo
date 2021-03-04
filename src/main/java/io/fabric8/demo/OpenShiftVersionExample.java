package io.fabric8.demo;

import io.fabric8.kubernetes.client.ConfigBuilder;
import io.fabric8.kubernetes.client.VersionInfo;
import io.fabric8.openshift.client.DefaultOpenShiftClient;
import io.fabric8.openshift.client.OpenShiftClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OpenShiftVersionExample {
    private static final Logger logger = LoggerFactory.getLogger(OpenShiftVersionExample.class);

    public static void main(String[] args) {
        final ConfigBuilder configBuilder = new ConfigBuilder();
        if (args.length > 0) {
            configBuilder.withMasterUrl(args[0]);
        }
        try(OpenShiftClient client = new DefaultOpenShiftClient(configBuilder.build())) {
            VersionInfo openShiftVersionInfo = client.getVersion();

            logger.info("Version details of this OpenShift cluster :-");
            logger.info("Major        : {}", openShiftVersionInfo.getMajor());
            logger.info("Minor        : {}", openShiftVersionInfo.getMinor());
            logger.info("GitVersion   : {}", openShiftVersionInfo.getGitVersion());
            logger.info("BuildDate    : {}", openShiftVersionInfo.getBuildDate());
            logger.info("GitTreeState : {}", openShiftVersionInfo.getGitTreeState());
            logger.info("Platform     : {}", openShiftVersionInfo.getPlatform());
            logger.info("GitVersion   : {}", openShiftVersionInfo.getGitVersion());
            logger.info("GoVersion    : {}", openShiftVersionInfo.getGoVersion());
            logger.info("GitCommit    : {}", openShiftVersionInfo.getGitCommit());
        }
    }
}
