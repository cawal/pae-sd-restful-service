package io.swagger.api;

import io.swagger.model.Appointment;
import io.swagger.model.Error;
import io.swagger.model.Patient;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import io.swagger.dao.*;

import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-14T20:17:40.903Z")

@Controller
public class PatientsApiController implements PatientsApi {



    public ResponseEntity<List<Patient>> patientsGet( @ApiParam(value = "Filters users by a substring of its names.") @RequestParam(value = "name", required = false) String name) {
        // do some magic!
        System.out.println("patientsGet");
        List<Patient> patientList = PatientDaoMock.getPatients();

        return new ResponseEntity<List<Patient>>(patientList, HttpStatus.OK);
    }

    public ResponseEntity<List<Appointment>> patientsIdAppointmentsGet(@ApiParam(value = "The patient ID.",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<List<Appointment>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> patientsIdDelete(@ApiParam(value = "The patient ID.",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Patient> patientsIdGet(@ApiParam(value = "The patient ID.",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<Patient>(HttpStatus.OK);
    }

    public ResponseEntity<Void> patientsIdPut(@ApiParam(value = "The patient ID.",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "The new version of the patient."  ) @RequestBody Patient patient) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> patientsPost(@ApiParam(value = "The new patient to include."  ) @RequestBody Patient patient) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}