package io.ylab.keycloak_example.core.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO representing user authorization credentials.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAuthorizeDTO {

    /**
     * userName in Keycloak
     */
    private String login;

    /**
     * The password for authorization.
     */
    private String password;
}
