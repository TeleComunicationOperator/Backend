package murraco.dto;

import java.util.List;

import lombok.Data;
import murraco.model.AppUserRole;

@Data
public class UserResponseDTO {
  private Integer id;
  private String username;
  private String email;
  List<AppUserRole> appUserRoles;

}
