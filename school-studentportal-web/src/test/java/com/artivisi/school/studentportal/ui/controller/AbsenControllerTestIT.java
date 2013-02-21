/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.school.studentportal.ui.controller;

import com.artivisi.school.studentportal.domain.HistoryAbsen;
import static org.hamcrest.Matchers.equalTo;
import com.jayway.restassured.authentication.FormAuthConfig;
import static com.jayway.restassured.RestAssured.with;
import org.junit.Test;
/**
 *
 * @author Hanifa
 */
public class AbsenControllerTestIT {
    public class RoleControllerTestIT {

    private String target = "http://localhost:10000/history/HistoryAbsensi";
    private String login = "http://localhost:10000/j_spring_security_check";
    private String username = "endy";
    private String password = "123";

    @Test
    private void testGetExistingById(String id, HistoryAbsen h) {
        
       with().header("Accept", "application/json")
                .auth().form(username, password, new FormAuthConfig(login, "j_username", "j_password"))
                .expect()
                .statusCode(200)
                .body("id", equalTo(h.getId()), "tanggal", equalTo(h.getTanggal()))
                .when().get(target + "/" + id);
    }

        

    }
}
