
package com.github.mickleroy.models;

import javax.annotation.PostConstruct;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class)
public class SampleModel {
    
    private boolean postContructCalled = false;
    
    @PostConstruct
    public void init() {
        this.postContructCalled = true;
    }

    public boolean isPostContructCalled() {
        return this.postContructCalled;
    }
}
