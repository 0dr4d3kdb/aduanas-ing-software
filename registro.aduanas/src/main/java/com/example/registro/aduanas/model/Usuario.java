package com.example.registro.aduanas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Usuario_registrado")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    @NotBlank(message = "El campo \"rut\" es obligatorio.")
    public String rut;

    @NotBlank(message = "El campo \"nombre\" es obligatorio.")
    @Column(nullable = false)
    public String nombreCompleto;

    @NotBlank(message = "El campo \"Correo electrónico\" es obligatorio.")
    @Column(nullable = false, unique = true)
    public String correo;

    @Pattern(regexp = "\\d{9}", message = "El teléfono debe tener exactamente 9 dígitos")
    @NotBlank(message = "El campo \"Teléfono de contacto\" es obligatorio.")
    @Column(nullable = false, unique = true)
    public String telefonoContacto;

    @NotBlank
    @Column(nullable = false)
    public String contrasena;

    public String confirmacionContrasena;

    @Column(nullable = false)
    public String tipoUsuario;
}
