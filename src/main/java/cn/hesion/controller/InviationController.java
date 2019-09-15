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
    @RequestMapping(value = "/inv/{Invtype}",method = RequestMethod.GET,produces={"application/JSON"})
    public AjaxResponse getInv(@PathVariable String Invtype){
        List<Invitation> inv = invitationService.getInvByType(Invtype);
        return AjaxResponse.success(inv);
    }
    @RequestMapping(value = "/invdetail/{id}",method = RequestMethod.GET,produces={"application/JSON"})
    public AjaxResponse getInvDetialByid(@PathVariable Long id){
        List<Invitation> inv = invitationService.getInvdetilById(id);
        return AjaxResponse.success(inv);
    }

}
