package com.example.blockchain.ethereum.service.mapper;

import com.example.blockchain.ethereum.persistence.entities.User;
import com.example.blockchain.ethereum.service.domain.UserVO;
import java.nio.charset.StandardCharsets;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class UserServiceMapperImpl implements UserServiceMapper {

    @Override
    public UserVO transformToVO(User entity) {
        if ( entity == null ) {
            return null;
        }

        UserVO userVO = new UserVO();

        userVO.setId( entity.getId() );
        userVO.setUsername( entity.getUsername() );
        userVO.setPassword( entity.getPassword() );
        userVO.setName( entity.getName() );
        userVO.setAccount( entity.getAccount() );
        userVO.setAvatar( entity.getAvatar() );

        return userVO;
    }

    @Override
    public User transformToEntity(UserVO vo) {
        if ( vo == null ) {
            return null;
        }

        User user = new User();

        user.setId( vo.getId() );
        user.setUsername( vo.getUsername() );
        user.setPassword( vo.getPassword() );
        user.setName( vo.getName() );
        user.setAccount( vo.getAccount() );
        user.setAvatar( vo.getAvatar() );

        return user;
    }
}
