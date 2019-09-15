package cn.hesion.service;

import cn.hesion.entity.Reply;

import java.util.List;

public interface IReplyService {
    List<Reply> getReplyByInvId(Long id);
}
