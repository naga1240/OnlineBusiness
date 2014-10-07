/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.onlinebusiness.dataaccess;

import javax.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Naga
 */
public class DataFacadeFactory {
    
    
    private CRUDFacade crudFacade;

    
    public CRUDFacade getDataFacadeInstance(ServletContext ctx){
        String contextParamValue=ctx.getInitParameter("projectStage");
        if(contextParamValue.equals("dev")){
            return crudFacade;
        }else{
            return null;
        }
        
    }

    public void setCrudFacade(CRUDFacade crudFacade) {
        this.crudFacade = crudFacade;
    }
      
}
