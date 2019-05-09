package by.anjei.controllers;

import by.anjei.Pipeline;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PipelineController {

    /*  ---------------------  Get a pipeline  ---------------------------*/
    @RequestMapping(value = "/pipeline/{id}", method = RequestMethod.GET)
    public ResponseEntity<Pipeline> getPipeline(@PathVariable("id") long id) {
        return new ResponseEntity<>(new Pipeline(), HttpStatus.OK);
    }

    /*  ---------------------  Create a pipeline  ---------------------------*/
    @RequestMapping(value = "/pipeline/", method = RequestMethod.POST)
    public ResponseEntity<Pipeline> createPipeline(@RequestBody Pipeline pipeline) {
        return new ResponseEntity<>(pipeline, HttpStatus.OK);
    }

    /*  ---------------------  Update a pipeline  ---------------------------*/
    @RequestMapping(value = "/pipeline/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Pipeline> updatePipeline(@PathVariable("id") long id, @RequestBody Pipeline pipeline) {
        return new ResponseEntity<>(pipeline, HttpStatus.OK);
    }

    /*  ---------------------  Get a single pipeline  ---------------------------*/
    @RequestMapping(value = "/pipeline/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Pipeline> deletePipeline(@PathVariable("id") long id) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
