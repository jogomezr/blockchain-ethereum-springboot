package com.example.blockchain.ethereum.service.mapper;

import com.example.blockchain.ethereum.persistence.entities.Proposal;
import com.example.blockchain.ethereum.service.domain.ProposalVO;
import java.nio.charset.StandardCharsets;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class ProposalServiceMapperImpl implements ProposalServiceMapper {

    @Override
    public ProposalVO transformToVO(Proposal entity) {
        if ( entity == null ) {
            return null;
        }

        ProposalVO proposalVO = new ProposalVO();

        proposalVO.setId( entity.getId() );
        proposalVO.setName( entity.getName() );
        proposalVO.setImage( entity.getImage() );
        proposalVO.setVotes( entity.getVotes() );

        return proposalVO;
    }

    @Override
    public Proposal transformToEntity(ProposalVO vo) {
        if ( vo == null ) {
            return null;
        }

        Proposal proposal = new Proposal();

        proposal.setId( vo.getId() );
        proposal.setName( vo.getName() );
        proposal.setImage( vo.getImage() );
        proposal.setVotes( vo.getVotes() );

        return proposal;
    }
}
