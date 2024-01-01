package com.example.demo.security.token;

import com.example.demo.user.User;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.boot.model.source.spi.EntityNamingSource;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Builder
@AllArgsConstructor
public class Token {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(unique = true)
    private String token;
    @Enumerated(EnumType.STRING)
    private TokenType tokenType = TokenType.BEARER;
    private boolean revoked;
    private boolean expired;
    @ManyToOne
    @JoinColumn(
            name = "user_id",
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "user_id"
            )
    )
    private User user;
}
