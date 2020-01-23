package com.epomeroy.jira.crowd.nexus3.plugin.internal;

import org.junit.Assert;
import org.junit.Test;

public class CrowdPropertiesTest {
    @Test
    public void testGetConnectTimeoutWithDefaults() throws Exception {
        CrowdProperties crowdProperties = new CrowdProperties();
        Assert.assertEquals(15000, crowdProperties.getConnectTimeout());
    }
}
