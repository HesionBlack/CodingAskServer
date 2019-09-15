package cn.hesion.controller;

import cn.hesion.entity.Reply;
import cn.hesion.service.IReplyService;
import cn.hesion.utils.AjaxResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/reply")
public class ReplyController {

    @Autowired
    private IReplyService replyService;
    @RequestMapping("/reply/{Invid}")
    public AjaxResponse getReplyByInvId(@PathVariable Long Invid){
        List<Reply> replyByInvId = replyService.getReplyByInvId(Invid);
        return AjaxResponse.success(replyByInvId);
    }
}
