package ru.pflb.idp.controller;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import ru.pflb.idp.model.User;
import ru.pflb.idp.service.UserService;

@Controller
public class AppController {
    final Logger logger = LoggerFactory.getLogger(AppController.class);

	@Autowired
	UserService userService;


    @RequestMapping(method = RequestMethod.GET, value = "/usersAll", produces = "application/json")
    @ResponseBody
    public Response getUsers(HttpServletRequest request,
                             @RequestParam(value = "start", required = false) int start,
                             @RequestParam(value = "length", required = false) int rows,
                             @RequestParam(value = "order[0][column]", required = false) int orderColNum,
                             @RequestParam(value = "order[0][dir]", required = false) String order)
            throws IOException{
        int page = start / rows;

        String sortBy = request.getParameter("columns[" + orderColNum + "][data]");
        logger.info("Listing users for grid with page: {}, rows: {}", page + 1, rows);
        logger.info("Listing users for grid with sort: {}, order: {}", sortBy, order);
        Sort sort = null;
        if (order != null) {
            if (order.equals("desc")) {
                sort = new Sort(Sort.Direction.DESC, sortBy);
            } else
                sort = new Sort(Sort.Direction.ASC, sortBy);
        }
        PageRequest pageRequest;
        if (sort != null) {
            pageRequest = new PageRequest(page, rows, sort);
        } else {
            pageRequest = new PageRequest(page, rows);
        }
        Page<User> result = userService.findAllByPage(pageRequest);
        Response response = new Response();
        response.setDraw(Integer.parseInt(request.getParameter("draw")));
        response.setRecordsFiltered((int) result.getTotalElements());
        response.setRecordsTotal(result.getTotalElements());
        response.setData(result.getContent());
        return response;
    }



}
