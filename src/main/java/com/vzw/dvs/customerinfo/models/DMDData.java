package com.vzw.dvs.customerinfo.models;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect
@JsonIgnoreProperties(ignoreUnknown = true)
public class DMDData {

    @JsonProperty
    private Results results;



    public Results getResults() {
        return results;
    }

    public void setResults(Results results) {
        this.results = results;
    }



}
