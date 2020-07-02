package gina;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.repository.Temporal;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Post {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String title;
    private String headline;
    private String content;

    @CreationTimestamp
    @Column(name = "create_date")
    private Date createDate;

    @UpdateTimestamp
    @Column(name = "modify_date")
    private Date modifyDate;

    public Post() {}

    public Post(String title, String headline, String content) {
        this.title = title;
        this.headline = headline;
        this.content = content;
    }

//    public User(String name) {
//        this.name = name;
//    }

}
