package tanyavolkova.samples.persistence;

import tanyavolkova.samples.persistence.jpa.Album;

import java.util.Collection;

/**
 * @author Tetiana Volkova
 */
public interface PhotoalbumService {

    Album create(Album album);

    Album update(Album album);

    Long delete(Album album);

    Album findById(Long id);

    Collection<Album> findAll();

    Collection<Album> findByName(String name);
}
