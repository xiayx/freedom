package org.freedom.jpa;

import javax.annotation.Nullable;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Query;
import java.util.List;

/**
 * a util class for {@link Query}
 *
 * @author xiayx
 */
public abstract class QueryUtils {

    /** when use {@link Query#getSingleResult()}, avoid {@link NoResultException} or {@link NonUniqueResultException} */
    @Nullable
    @SuppressWarnings("unchecked")
    public static <T> T getSingleResult(Query query) {
        List resultList = query.getResultList();
        return resultList.size() == 1 ? (T) resultList.get(0) : null;
    }

}
