package com.ms.user.controller.v1.docs;

import com.ms.user.dto.UserDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

@Tag(name = "user controller", description = "API que expone CRUD de la entidad user")
public class UserDoc {

    @Operation(summary = "crear usuario", description = "Esta operación es para crear un usuario")
    @ApiResponse(
            value = {
                    @ApiResponse(responseCode = "201",
                            description = "Usuario creado",
                            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
                    )
            }
    )
    ResponseEntity create(@RequestBody UserDTO userDTO);
}
