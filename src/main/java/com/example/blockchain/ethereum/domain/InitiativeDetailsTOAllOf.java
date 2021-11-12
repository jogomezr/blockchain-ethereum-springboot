package com.example.blockchain.ethereum.domain;

import java.util.Objects;
import com.example.blockchain.ethereum.domain.ProposalTO;
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
 * InitiativeDetailsTOAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-12T12:03:47.180847300+01:00[Europe/Paris]")

public class InitiativeDetailsTOAllOf  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("proposals")
  @Valid
  private List<ProposalTO> proposals = null;

  public InitiativeDetailsTOAllOf proposals(List<ProposalTO> proposals) {
    this.proposals = proposals;
    return this;
  }

  public InitiativeDetailsTOAllOf addProposalsItem(ProposalTO proposalsItem) {
    if (this.proposals == null) {
      this.proposals = new ArrayList<>();
    }
    this.proposals.add(proposalsItem);
    return this;
  }

  /**
   * Get proposals
   * @return proposals
  */
  @ApiModelProperty(value = "")

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
    InitiativeDetailsTOAllOf initiativeDetailsTOAllOf = (InitiativeDetailsTOAllOf) o;
    return Objects.equals(this.proposals, initiativeDetailsTOAllOf.proposals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proposals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiativeDetailsTOAllOf {\n");
    
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

