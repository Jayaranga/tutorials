package org.baeldung.spring.persistence.service;

import org.baeldung.spring.persistence.config.PersistenceConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { PersistenceConfig.class }, loader = AnnotationConfigContextLoader.class)
public class OwnerServicePersistenceIntegrationTest {

    @Autowired
    private IOwnerService service;

    @Autowired
    private IChildService childService;

    // tests

    @Test
    public final void whenContextIsBootstrapped_thenNoExceptions() {
        //
    }

}