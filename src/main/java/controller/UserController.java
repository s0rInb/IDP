package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.Response;
import java.io.IOException;

/**
 * Created by Leporidae on 18.11.2015.
 */

@Controller
public class UserController {
    @RequestMapping(method = RequestMethod.GET, value = "/users", produces = "application/json")
    @ResponseBody
    public Response getUsers(HttpServletRequest request) throws IOException{
    return null;
    }
}
