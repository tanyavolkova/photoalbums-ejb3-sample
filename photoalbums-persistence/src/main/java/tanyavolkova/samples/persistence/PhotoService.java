package tanyavolkova.samples.persistence;

import tanyavolkova.samples.persistence.jpa.Photo;

import java.util.Collection;

/**
 * @author Tetiana Volkova
 */
public interface PhotoService {

    Photo create(Photo photo);

    Photo update(Photo photo);

    Long delete(Photo photo);

    Photo findById(Long id);

    Collection<Photo> findByAlbumId(Long albumId);

    Collection<Photo> findByUserId(Long userId);
}
