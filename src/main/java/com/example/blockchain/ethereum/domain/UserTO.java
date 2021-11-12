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
 * UserTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-12T12:03:47.180847300+01:00[Europe/Paris]")

public class UserTO  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("username")
  private String username;

  @JsonProperty("name")
  private String name;

  @JsonProperty("account")
  private String account;

  @JsonProperty("avatar")
  private String avatar;

  public UserTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public UserTO username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public UserTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserTO account(String account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public UserTO avatar(String avatar) {
    this.avatar = avatar;
    return this;
  }

  /**
   * Get avatar
   * @return avatar
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTO userTO = (UserTO) o;
    return Objects.equals(this.id, userTO.id) &&
        Objects.equals(this.username, userTO.username) &&
        Objects.equals(this.name, userTO.name) &&
        Objects.equals(this.account, userTO.account) &&
        Objects.equals(this.avatar, userTO.avatar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, name, account, avatar);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
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

