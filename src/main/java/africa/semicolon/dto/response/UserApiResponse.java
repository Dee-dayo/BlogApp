package africa.semicolon.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserApiResponse {

    boolean isSuccessful;
    Object userRegisterResponse;
}
