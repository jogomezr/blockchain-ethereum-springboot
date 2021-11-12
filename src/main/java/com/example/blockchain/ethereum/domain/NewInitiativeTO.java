package com.example.blockchain.ethereum.domain;

import java.util.Objects;
import com.example.blockchain.ethereum.domain.NewProposalTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NewInitiativeTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-12T14:06:22.439619200+01:00[Europe/Paris]")

public class NewInitiativeTO  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("startDate")
  private String startDate;

  @JsonProperty("endDate")
  private String endDate;

  @JsonProperty("proposals")
  @Valid
  private List<NewProposalTO> proposals = new ArrayList<>();

  public NewInitiativeTO name(String name) {
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

  public NewInitiativeTO description(String description) {
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

  public NewInitiativeTO startDate(String startDate) {
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

  public NewInitiativeTO endDate(String endDate) {
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

  public NewInitiativeTO proposals(List<NewProposalTO> proposals) {
    this.proposals = proposals;
    return this;
  }

  public NewInitiativeTO addProposalsItem(NewProposalTO proposalsItem) {
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

  public List<NewProposalTO> getProposals() {
    return proposals;
  }

  public void setProposals(List<NewProposalTO> proposals) {
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
    NewInitiativeTO newInitiativeTO = (NewInitiativeTO) o;
    return Objects.equals(this.name, newInitiativeTO.name) &&
        Objects.equals(this.description, newInitiativeTO.description) &&
        Objects.equals(this.startDate, newInitiativeTO.startDate) &&
        Objects.equals(this.endDate, newInitiativeTO.endDate) &&
        Objects.equals(this.proposals, newInitiativeTO.proposals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, startDate, endDate, proposals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewInitiativeTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

