package com.example.blockchain.ethereum.domain;

import java.util.Objects;
import com.example.blockchain.ethereum.domain.InitiativeDetailsTOAllOf;
import com.example.blockchain.ethereum.domain.InitiativeTO;
import com.example.blockchain.ethereum.domain.ProposalTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiativeDetailsTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-12T14:06:22.439619200+01:00[Europe/Paris]")

public class InitiativeDetailsTO  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("creationDate")
  private String creationDate;

  @JsonProperty("startDate")
  private String startDate;

  @JsonProperty("endDate")
  private String endDate;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    ACTIVE("active"),
    
    PENDING("pending"),
    
    FINISHED("finished");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  @JsonProperty("numProposals")
  private Long numProposals;

  @JsonProperty("proposals")
  @Valid
  private List<ProposalTO> proposals = new ArrayList<>();

  public InitiativeDetailsTO id(Long id) {
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

  public InitiativeDetailsTO name(String name) {
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

  public InitiativeDetailsTO description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public InitiativeDetailsTO creationDate(String creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Get creationDate
   * @return creationDate
  */
  @ApiModelProperty(example = "2011-12-03T10:15:30", required = true, value = "")
  @NotNull


  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

  public InitiativeDetailsTO startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  */
  @ApiModelProperty(example = "2011-12-03T10:15:30", required = true, value = "")
  @NotNull


  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public InitiativeDetailsTO endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  */
  @ApiModelProperty(example = "2011-12-03T10:15:30", required = true, value = "")
  @NotNull


  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public InitiativeDetailsTO status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public InitiativeDetailsTO numProposals(Long numProposals) {
    this.numProposals = numProposals;
    return this;
  }

  /**
   * Get numProposals
   * @return numProposals
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Long getNumProposals() {
    return numProposals;
  }

  public void setNumProposals(Long numProposals) {
    this.numProposals = numProposals;
  }

  public InitiativeDetailsTO proposals(List<ProposalTO> proposals) {
    this.proposals = proposals;
    return this;
  }

  public InitiativeDetailsTO addProposalsItem(ProposalTO proposalsItem) {
    this.proposals.add(proposalsItem);
    return this;
  }

  /**
   * Get proposals
   * @return proposals
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<ProposalTO> getProposals() {
    return proposals;
  }

  public void setProposals(List<ProposalTO> proposals) {
    this.proposals = proposals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiativeDetailsTO initiativeDetailsTO = (InitiativeDetailsTO) o;
    return Objects.equals(this.id, initiativeDetailsTO.id) &&
        Objects.equals(this.name, initiativeDetailsTO.name) &&
        Objects.equals(this.description, initiativeDetailsTO.description) &&
        Objects.equals(this.creationDate, initiativeDetailsTO.creationDate) &&
        Objects.equals(this.startDate, initiativeDetailsTO.startDate) &&
        Objects.equals(this.endDate, initiativeDetailsTO.endDate) &&
        Objects.equals(this.status, initiativeDetailsTO.status) &&
        Objects.equals(this.numProposals, initiativeDetailsTO.numProposals) &&
        Objects.equals(this.proposals, initiativeDetailsTO.proposals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, creationDate, startDate, endDate, status, numProposals, proposals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiativeDetailsTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    numProposals: ").append(toIndentedString(numProposals)).append("\n");
    sb.append("    proposals: ").append(toIndentedString(proposals)).append("\n");
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

