package cn.hesion.controller;

import cn.hesion.entity.Invitation;
import cn.hesion.service.IInvitationService;
import cn.hesion.utils.AjaxResponse;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/invs")
public class InviationController {
    @Autowired
    private IInvitationService invitationService;

    @RequestMapping(value = "/inv",method = RequestMethod.POST,produces={"application/JSON"})
    public AjaxResponse pushInv(){

        return AjaxResponse.success("发帖成功");
    }
    @RequestMapping(value = "/inv",method = RequestMethod.GET,produces={"application/JSON"})
    public AjaxResponse getInv(){
        List<Invitation> inv = invitationService.getInv();
        return AjaxResponse.success(inv);
    }
    @RequestMapping(value = "/inv/{id}",method = RequestMethod.GET,produces={"application/JSON"})
    public AjaxResponse getInv(@PathVariable long id){
        List<Invitation> inv = invitationService.getInvById(id);
        return AjaxResponse.success(inv);
    }

}
