package cn.hesion.service.Impl;

import cn.hesion.dao.IinvitationDao;
import cn.hesion.entity.Invitation;
import cn.hesion.service.IInvitationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvitationServiceIml implements IInvitationService {
    @Autowired
    private IinvitationDao invitationDao;

    @Override
    public List<Invitation> getInv(){
        return invitationDao.getInv();
    }

    @Override
    public List<Invitation> getInvByType(String type) {
        return invitationDao.getInvByType(type);
    }

    @Override
    public List<Invitation> getInvdetilById(long id) {
        return invitationDao.getInvdetialById(id);
    }
}
