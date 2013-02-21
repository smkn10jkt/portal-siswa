/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.school.studentportal.service.impl;

import com.artivisi.school.studentportal.domain.HistoryAbsen;
import com.artivisi.school.studentportal.service.BelajarRestfulService;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author Hanifa
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:com/artivisi/school/studentportal/**/applicationContext.xml"})
public class AbsenServiceTestIT {
    
    @Autowired private BelajarRestfulService belajarRestfulService;
    
    @Test
    public void testFindAll(){
        Page<HistoryAbsen>result = belajarRestfulService.findAllHistoryAbsens(new PageRequest(0, belajarRestfulService.countAllHistoryAbsens().intValue()));
        assertTrue(result.getTotalElements() > 0);
    }
    }    

