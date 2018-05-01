package org.freedom.jpa;

import org.junit.After;
import org.junit.Before;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * abstract super class for jpa test
 *
 * @author xiayx
 */
public abstract class JpaTest {

    protected EntityManagerFactory entityManagerFactory;

    @Before
    public void setUp() throws Exception {
        entityManagerFactory = Persistence.createEntityManagerFactory("org.freedom.jpa");
    }

    @After
    public void tearDown() throws Exception {
        entityManagerFactory.close();
    }
}
