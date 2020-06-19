package ru.top.prom.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.top.prom.service.api.SRService;
import ru.top.prom.service.api.SearchCriteria;
import ru.top.prom.service.api.SearchResult;

@RestController
public class ReportRest {

    private SRService service;

    public ReportRest(SRService SRService) {
        this.service = SRService;
    }

    @GetMapping(value = "/echo")
    public String echo() {
        return "Welcom to Scale Report 2.0";
    }

    @PostMapping(value = "/search")
    public SearchResult search(@RequestBody SearchCriteria criteria) {
        return service.findWeightAuto(criteria);
    }

    @PostMapping(value = "/search/all")
    public SearchResult searchAll(@RequestBody SearchCriteria criteria) {
        return service.findWeightAutoAll(criteria);
    }
}
