/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sshclient.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.mvc.SimpleFormController;
import sshclient.model.Users;

/** 
 *
 * @author eshkolyar
 */
public class RegistrationController extends SimpleFormController {
    
    public String viewName=null;

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }
    public String getViewName() {
        return this.viewName;
    }
    public RegistrationController() {
        //Initialize controller properties here or
        //in the Web Application Context

        setCommandClass(Users.class);
        //setCommandName("MyCommandName");
        //setSuccessView("successView");
        //setFormView("formView");
    }

    @Override
    protected Object formBackingObject(HttpServletRequest request) throws ServletException{
        Users user = new Users();
        request.setAttribute("name", "project");
        return user;
    }

    @Override
    protected void doSubmitAction(Object command) throws Exception {
        Users user = (Users) command;
        throw new UnsupportedOperationException("Not yet implemented");
    }

    //Use onSubmit instead of doSubmitAction 
    //when you need access to the Request, Response, or BindException objects
    /*
    @Override
    protected ModelAndView onSubmit(
            HttpServletRequest request, 
            HttpServletResponse response, 
            Object command, 
            BindException errors) throws Exception {
        ModelAndView mv = new ModelAndView(getSuccessView());
        //Do something...
        return mv;
    }
    */

}