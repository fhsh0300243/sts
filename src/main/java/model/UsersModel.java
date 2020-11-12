package model;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonProperty;
import data.TableName;
import lombok.Data;

@Data
@Entity
@Table(name = TableName.USERS)
public class UsersModel {
  
  @JsonProperty("usersId")
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(columnDefinition = "serial", name = "id" )
  private Long id;
  
  @JsonProperty("account")
  @Column(name = "account")
  private String account;
  
  @JsonProperty("passwordHash")
  @Column(name = "password_hash")
  private String passwordHash;
  
  @JsonProperty("accessToken")
  @Column(name = "access_token")
  private String accessToken;
  
  @JsonProperty("balance")
  @Column(name = "balance")
  private BigDecimal balance;
  
  @JsonProperty("email")
  @Column(name = "email")
  private String email;
  
  @JsonProperty("status")
  @Column(name = "status")
  private int status;
}
