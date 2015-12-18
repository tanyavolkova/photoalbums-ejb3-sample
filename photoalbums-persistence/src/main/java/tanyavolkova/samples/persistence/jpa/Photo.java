package tanyavolkova.samples.persistence.jpa;

import javax.persistence.*;

/**
 * @author Tetiana Volkova
 */
@Entity
@Table
public class Photo {

private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(nullable = false, name = "id")
    private Long id;

    @Column(nullable = false, name = "album_id")
    private Long albumId;

    @Column(nullable = true, name = "title")
    private String title;

    @Column(nullable = true, name = "description")
    private String description;
}
