package org.freedom.associate;

import org.freedom.associate.jpa.JpaPropertyCollectionAssociatedSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@SuppressWarnings("unchecked")
@Transactional
public class ForAssociateName extends JpaPropertyCollectionAssociatedSource<Long, String> {

    public ForAssociateName() {
        setEntityClass(Associated.class);
        setAssociatedProperty("name");
    }

}
