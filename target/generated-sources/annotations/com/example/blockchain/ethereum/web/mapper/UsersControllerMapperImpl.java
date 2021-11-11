package com.example.blockchain.ethereum.web.mapper;

import com.example.blockchain.ethereum.domain.UserTO;
import com.example.blockchain.ethereum.service.domain.UserVO;
import java.nio.charset.StandardCharsets;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class UsersControllerMapperImpl implements UsersControllerMapper {

    @Override
    public UserVO transformToVO(UserTO to) {
        if ( to == null ) {
            return null;
        }

        UserVO userVO = new UserVO();

        userVO.setId( to.getId() );
        userVO.setUsername( to.getUsername() );
        userVO.setName( to.getName() );
        userVO.setAccount( to.getAccount() );
        userVO.setAvatar( to.getAvatar() );

        return userVO;
    }

    @Override
    public UserTO transformToTO(UserVO vo) {
        if ( vo == null ) {
            return null;
        }

        UserTO userTO = new UserTO();

        userTO.setId( vo.getId() );
        userTO.setUsername( vo.getUsername() );
        userTO.setName( vo.getName() );
        userTO.setAccount( vo.getAccount() );
        userTO.setAvatar( vo.getAvatar() );

        return userTO;
    }
}
