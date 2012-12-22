package com.dhiraj.jmxweb.web;

import com.dhiraj.jmxweb.model.JobUser;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/jobusers")
@Controller
@RooWebScaffold(path = "jobusers", formBackingObject = JobUser.class)
public class JobUserController {
}
