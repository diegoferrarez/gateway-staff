package br.com.system.staff.model.dto;

import br.com.system.staff.model.Staff;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StaffResponse {

    private String name;
    private String surname;
    private int age;

    public static StaffResponse conversor(Staff c){
        return StaffResponse.builder()
                .name(c.getName())
                .surname(c.getSurname())
                .age(c.getAge())
                .build();
    }
}
