/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.school.studentportal.ui.controller;

import com.artivisi.school.studentportal.domain.HistoryAbsen;
import com.artivisi.school.studentportal.service.BelajarRestfulService;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author Hanifa
 */
@Controller
public class AbsenController {
    @Autowired private BelajarRestfulService belajarRestfulService;
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @RequestMapping(value="history/HistoryAbsensi{id}", method= RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable String id){
        HistoryAbsen hDb = belajarRestfulService.findHistoryAbsenById(id);
        if(hDb ==null){
            throw new IllegalStateException();
        }
        belajarRestfulService.delete(hDb);
    }
    
    
    @RequestMapping(value="/history/HistoryAbsensi{id}", method=RequestMethod.GET)
    @ResponseBody
        public HistoryAbsen findHistoryAbsenById(@PathVariable String id){
        
        return belajarRestfulService.findHistoryAbsenById(id);
    }
    
    @RequestMapping(value="/history/HistoryAbsensi",method=RequestMethod.GET)
    @ResponseBody
        public Page<HistoryAbsen>findAllHistoryAbsens(
        Pageable pageable,
        HttpServletResponse response){
        return belajarRestfulService.findAllHistoryAbsens(pageable);
    }
            
}
