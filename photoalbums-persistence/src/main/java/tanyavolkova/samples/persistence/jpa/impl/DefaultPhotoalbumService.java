package tanyavolkova.samples.persistence.jpa.impl;

import tanyavolkova.samples.persistence.PhotoalbumService;
import tanyavolkova.samples.persistence.jpa.Album;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

/**
 * @author Tetiana Volkova
 */
@Resource
public class DefaultPhotoalbumService implements PhotoalbumService {

    @PersistenceContext(unitName = "photoalbums-pu")
    private EntityManager entityManager;

    @Override
    public Album create(Album album) {
        entityManager.persist(album);
        return null;
    }

    @Override
    public Album update(Album album) {
        entityManager.merge(album);
        return null;
    }

    @Override
    public Long delete(Album album) {
        return null;
    }

    @Override
    public Album findById(Long id) {
        return null;
    }

    @Override
    public Collection<Album> findAll() {
        return null;
    }

    @Override
    public Collection<Album> findByName(String name) {
        return null;
    }
}
