package cn.hesion.service.Impl;

import cn.hesion.dao.IReplayDao;
import cn.hesion.entity.Reply;
import cn.hesion.service.IReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReplyServiceImpl implements IReplyService {

    @Autowired
    private IReplayDao replayDao;
    @Override
    public List<Reply> getReplyByInvId(Long Invid) {
        return replayDao.getReplybyInvId(Invid);
    }
}
