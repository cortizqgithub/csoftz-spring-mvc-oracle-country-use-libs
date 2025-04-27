/*----------------------------------------------------------------------------*/
/* Source File:   HOMECONTROLLER.JAVA                                         */
/* Copyright (c), 2025 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Apr.21/2025  COQ  File created.
 -----------------------------------------------------------------------------*/
package com.csoftz.country.controller.api.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The HomeController serves as a REST controller that handles HTTP requests
 * for the home endpoint.
 * <p>
 * Uses the {@code /api/v1/home} base path.
 *
 * @author COQ - Carlos Adolfo Ortiz Q.
 */
@RestController
@RequestMapping("/api/v1/home")
public class HomeController {

    @GetMapping
    public String sayHello() {
        return "Hello World!";
    }
}
