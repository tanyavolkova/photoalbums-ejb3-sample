package tanyavolkova.samples.persistence.jpa;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author Tetiana Volkova
 */
@Entity
@Table(name = "user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(nullable = false, name = "id")
    private Long id;

    @Column(nullable = false, name = "login")
    private String login;

    @Column(nullable = false, name = "password")
    private String password;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<Album> albums;
}
