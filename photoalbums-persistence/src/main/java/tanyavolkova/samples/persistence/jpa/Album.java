package tanyavolkova.samples.persistence.jpa;

import javax.persistence.*;
import java.util.List;

/**
 * @author Tetiana Volkova
 */
@Entity
@Table(name = "album")
public class Album {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(nullable = false, name = "id")
    private Long id;

    @Column(nullable = false, name = "user_id")
    private Long userId;

    @Column(nullable = false, name = "title")
    private String title;

    @Column(nullable = true, name = "description")
    private String description;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "album_id")
    private List<Photo> photos;
}
