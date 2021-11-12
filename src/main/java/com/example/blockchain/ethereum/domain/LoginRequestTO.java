package com.example.blockchain.ethereum.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LoginRequestTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-12T14:06:22.439619200+01:00[Europe/Paris]")

public class LoginRequestTO  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("username")
  private String username;

  @JsonProperty("password")
  private String password;

  public LoginRequestTO username(String username) {
    this.username = username;
    return this;
  }

  /**
   * The user name for login
   * @return username
  */
  @ApiModelProperty(required = true, value = "The user name for login")
  @NotNull


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public LoginRequestTO password(String password) {
    this.password = password;
    return this;
  }

  /**
   * The password for login in clear text
   * @return password
  */
  @ApiModelProperty(required = true, value = "The password for login in clear text")
  @NotNull


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginRequestTO loginRequestTO = (LoginRequestTO) o;
    return Objects.equals(this.username, loginRequestTO.username) &&
        Objects.equals(this.password, loginRequestTO.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginRequestTO {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

