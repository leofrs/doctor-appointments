package com.devLeo.Appointments.DTO.request;

import com.devLeo.Appointments.utils.UserRoleUtils;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class UserRequest {
    @NotBlank(message = "Nome do paciente não pode ser vazio")
    private String userName;

    @NotBlank(message = "Credêncial de acesso não pode ser vazio")
    private String accessCredential;

    @NotBlank(message = "Senha não pode ser vazio")
    @Size(min = 3, max = 20, message = "A senha deve ter entre 3 e 20 caracteres.")
    private String password;

    @NotNull
    private UserRoleUtils userRole;
}
