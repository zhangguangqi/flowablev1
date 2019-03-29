package com.bettem.floable.v1;

import org.flowable.engine.ProcessEngine;
import org.flowable.engine.ProcessEngineConfiguration;
import org.flowable.engine.impl.cfg.StandaloneProcessEngineConfiguration;

public class HolidayRequest {
    public static void main(String[] args) {

        ProcessEngineConfiguration cfg = new StandaloneProcessEngineConfiguration()
                .setJdbcUrl("jdbc:oracle:thin:@localhost:1521:orcl")
                .setJdbcUsername("flow1")
                .setJdbcPassword("flow1")
                .setJdbcDriver("oracle.jdbc.OracleDriver")
                .setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);
        ProcessEngine processEngine = cfg.buildProcessEngine();
    }
}
