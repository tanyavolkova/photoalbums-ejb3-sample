package tanyavolkova.samples.persistence.jpa.impl;

import tanyavolkova.samples.persistence.PhotoService;
import tanyavolkova.samples.persistence.jpa.Photo;

import java.util.Collection;

/**
 * @author Tetiana Volkova
 */
public class DefaultPhotoService implements PhotoService {

    @Override
    public Photo create(Photo photo) {
        return null;
    }

    @Override
    public Photo update(Photo photo) {
        return null;
    }

    @Override
    public Long delete(Photo photo) {
        return null;
    }

    @Override
    public Photo findById(Long id) {
        return null;
    }

    @Override
    public Collection<Photo> findByAlbumId(Long albumId) {
        return null;
    }

    @Override
    public Collection<Photo> findByUserId(Long userId) {
        return null;
    }
}
