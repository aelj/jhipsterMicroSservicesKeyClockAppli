package com.bdf.jhipster.microservices.cucumber.stepdefs;

import com.bdf.jhipster.microservices.JhipsterMicroSservicesKeyClockAppliApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JhipsterMicroSservicesKeyClockAppliApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
