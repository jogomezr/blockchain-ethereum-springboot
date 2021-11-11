package com.example.blockchain.ethereum.service.mapper;

import com.example.blockchain.ethereum.persistence.entities.Initiative;
import com.example.blockchain.ethereum.persistence.entities.Proposal;
import com.example.blockchain.ethereum.service.domain.InitiativeVO;
import com.example.blockchain.ethereum.service.domain.ProposalVO;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class InitiativeServiceMapperImpl implements InitiativeServiceMapper {

    @Override
    public InitiativeVO transformToVO(Initiative entity) {
        if ( entity == null ) {
            return null;
        }

        InitiativeVO initiativeVO = new InitiativeVO();

        initiativeVO.setId( entity.getId() );
        initiativeVO.setName( entity.getName() );
        initiativeVO.setDescription( entity.getDescription() );
        initiativeVO.setCreationDate( entity.getCreationDate() );
        initiativeVO.setStartDate( entity.getStartDate() );
        initiativeVO.setEndDate( entity.getEndDate() );
        initiativeVO.setProposals( proposalListToProposalVOList( entity.getProposals() ) );

        return initiativeVO;
    }

    @Override
    public Initiative transformToEntity(InitiativeVO vo) {
        if ( vo == null ) {
            return null;
        }

        Initiative initiative = new Initiative();

        initiative.setId( vo.getId() );
        initiative.setName( vo.getName() );
        initiative.setDescription( vo.getDescription() );
        initiative.setCreationDate( vo.getCreationDate() );
        initiative.setStartDate( vo.getStartDate() );
        initiative.setEndDate( vo.getEndDate() );
        if ( initiative.getProposals() != null ) {
            List<Proposal> list = proposalVOListToProposalList( vo.getProposals() );
            if ( list != null ) {
                initiative.getProposals().addAll( list );
            }
        }

        return initiative;
    }

    protected ProposalVO proposalToProposalVO(Proposal proposal) {
        if ( proposal == null ) {
            return null;
        }

        ProposalVO proposalVO = new ProposalVO();

        proposalVO.setId( proposal.getId() );
        proposalVO.setName( proposal.getName() );
        proposalVO.setImage( proposal.getImage() );
        proposalVO.setVotes( proposal.getVotes() );

        return proposalVO;
    }

    protected List<ProposalVO> proposalListToProposalVOList(List<Proposal> list) {
        if ( list == null ) {
            return null;
        }

        List<ProposalVO> list1 = new ArrayList<ProposalVO>( list.size() );
        for ( Proposal proposal : list ) {
            list1.add( proposalToProposalVO( proposal ) );
        }

        return list1;
    }

    protected Proposal proposalVOToProposal(ProposalVO proposalVO) {
        if ( proposalVO == null ) {
            return null;
        }

        Proposal proposal = new Proposal();

        proposal.setId( proposalVO.getId() );
        proposal.setName( proposalVO.getName() );
        proposal.setImage( proposalVO.getImage() );
        proposal.setVotes( proposalVO.getVotes() );

        return proposal;
    }

    protected List<Proposal> proposalVOListToProposalList(List<ProposalVO> list) {
        if ( list == null ) {
            return null;
        }

        List<Proposal> list1 = new ArrayList<Proposal>( list.size() );
        for ( ProposalVO proposalVO : list ) {
            list1.add( proposalVOToProposal( proposalVO ) );
        }

        return list1;
    }
}
