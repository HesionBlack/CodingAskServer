package cn.hesion.service;

import cn.hesion.entity.Invitation;

import java.util.List;

public interface IInvitationService {
    public List<Invitation> getInv();

    List<Invitation> getInvByType(String type);

    List<Invitation> getInvdetilById(long id);
}
