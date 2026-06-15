        package com.example.demo.dto;


        import jakarta.validation.constraints.Min;
        import jakarta.validation.constraints.NotBlank;
        import jakarta.validation.constraints.NotNull;

        public record AnimalRequestDTO(

                @NotBlank(message = "Precisamos de um nome para o animal!")
                String nome,
                @NotBlank(message = "Precisamos identificar alguma especie para seu animal!")
                String especie,
                @Min(value = 0, message = "A idade não pode ser negativo!")
                Integer idade,
                @NotNull(message = "Precisamos que informe o ID do tutor!")
                Long tutorId
        ) { }
