package org.freedom.jpa;

import org.junit.Assert;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * tests for {@link QueryUtils}
 *
 * @author xiayx
 */
public class QueryUtilsTest extends JpaTest {
    @Test
    public void getSingleResult() throws Exception {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("from UnNamed");
        Object result = QueryUtils.getSingleResult(query);
        Assert.assertNull(result);
    }

}