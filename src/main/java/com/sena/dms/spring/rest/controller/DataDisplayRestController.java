package com.sena.dms.spring.rest.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sena.dms.spring.model.data.DataDisplayInfoWrapper;
import com.sena.dms.spring.model.data.DistrictsData;
import com.sena.dms.spring.model.data.ErrorInfoData;
import com.sena.dms.spring.model.data.GenderData;
import com.sena.dms.spring.model.data.MandalsData;
import com.sena.dms.spring.model.data.MaritalStatusData;
import com.sena.dms.spring.model.data.ProfessionalData;
import com.sena.dms.spring.model.data.QualificationData;
import com.sena.dms.spring.model.data.StatesData;
import com.sena.dms.spring.model.entity.Districts;
import com.sena.dms.spring.model.entity.Gender;
import com.sena.dms.spring.model.entity.Mandals;
import com.sena.dms.spring.model.entity.MaritalStatus;
import com.sena.dms.spring.model.entity.Profession;
import com.sena.dms.spring.model.entity.Qualification;
import com.sena.dms.spring.model.entity.States;
import com.sena.dms.spring.service.DataDisplayService;
import com.sena.dms.spring.util.ApplicationConstants;
import com.sena.dms.spring.validator.DataDisplayValidator;

@RestController
@RequestMapping("/rest/datadisplay")
public class DataDisplayRestController implements ApplicationConstants {
	private static final Logger logger = LoggerFactory.getLogger(DataDisplayRestController.class);

	private DataDisplayService dataDisplayService;

	@Autowired
	private DataDisplayValidator validator;

	@Autowired(required = true)
	@Qualifier(value = "dataDisplayService")
	public void setRegistrationService(DataDisplayService dataDisplayService) {
		this.dataDisplayService = dataDisplayService;
	}

	@RequestMapping(value = "/listvvtdata", method = RequestMethod.GET, headers = "Accept=application/json", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<DataDisplayInfoWrapper> listVVTData() {
		logger.info(">>>>> listStates >>>>");
		ErrorInfoData errorInfoData = new ErrorInfoData();
		DataDisplayInfoWrapper dataDisplayInfoWrapper = new DataDisplayInfoWrapper();
		List<StatesData> statesData = new ArrayList<StatesData>();
		List<DistrictsData> districtsData = new ArrayList<DistrictsData>();
		List<GenderData> gendersData = new ArrayList<GenderData>();
		List<MaritalStatusData> maritalStatusesData = new ArrayList<MaritalStatusData>();
		List<QualificationData> qualificationsData = new ArrayList<QualificationData>();
		List<ProfessionalData> professionalsData = new ArrayList<ProfessionalData>();

		try {
			List<States> listOfStates = dataDisplayService.fetchStatesData();
			List<Districts> listOfDistricts = null;
			if (listOfStates != null && !listOfStates.isEmpty()) {
				StatesData stateData = null;
				for (States states : listOfStates) {
					stateData = new StatesData();
					districtsData = new ArrayList<DistrictsData>();
					stateData.setState_code(states.getState_code());
					stateData.setState_name(states.getState_name());
					stateData.setState_web_name(states.getState_web_name());

					listOfDistricts = states.getDistricts();
					if (listOfDistricts != null && !listOfDistricts.isEmpty()) {
						DistrictsData districtData = null;
						for (Districts districts : listOfDistricts) {
							districtData = new DistrictsData();
							districtData.setDistrict_code(districts.getDistrict_code());
							districtData.setDistrict_name(districts.getDistrict_name());
							districtData.setDistrict_web_name(districts.getDistrict_web_name());

							districtsData.add(districtData);
						}
						Collections.sort(districtsData, DistrictsData.DistrictsDataCompareByName);
						stateData.setDistrictsInfos(districtsData);
					}

					statesData.add(stateData);
				}
				dataDisplayInfoWrapper.setStatesData(statesData);
			}
			if (statesData.isEmpty() || districtsData.isEmpty()) {
				buildSystemFailureError(dataDisplayInfoWrapper, DATA_NOT_AVAILABLE_MSG, errorInfoData, null);
			}

			List<Gender> listOfGender = dataDisplayService.fetchGenderData();
			if (listOfGender != null && !listOfGender.isEmpty()) {
				GenderData genderData = null;
				for (Gender gender : listOfGender) {
					genderData = new GenderData();
					genderData.setGender_code(gender.getGender_code());
					genderData.setGender_name(gender.getGender_name());
					genderData.setGender_web_name(gender.getGender_web_name());
					gendersData.add(genderData);
				}
				dataDisplayInfoWrapper.setGendersData(gendersData);
			}

			List<MaritalStatus> listOfMaritalStatus = dataDisplayService.fetchMaritalStatusData();
			if (listOfMaritalStatus != null && !listOfMaritalStatus.isEmpty()) {
				MaritalStatusData maritalStatusData = null;
				for (MaritalStatus maritalStatus : listOfMaritalStatus) {
					maritalStatusData = new MaritalStatusData();
					maritalStatusData.setMarital_status_code(maritalStatus.getMarital_status_code());
					maritalStatusData.setMarital_status_name(maritalStatus.getMarital_status_name());
					maritalStatusData.setMarital_status_web_name(maritalStatus.getMarital_status_web_name());
					maritalStatusesData.add(maritalStatusData);
				}
				dataDisplayInfoWrapper.setMaritalStatusesData(maritalStatusesData);
			}

			List<Qualification> listOfQualification = dataDisplayService.fetchQualificationData();
			if (listOfQualification != null && !listOfQualification.isEmpty()) {
				QualificationData qualificationData = null;
				for (Qualification qualification : listOfQualification) {
					qualificationData = new QualificationData();
					qualificationData.setQualification_code(qualification.getQualification_code());
					qualificationData.setQualification_name(qualification.getQualification_name());
					qualificationData.setQualification_web_name(qualification.getQualification_web_name());
					qualificationsData.add(qualificationData);
				}
				dataDisplayInfoWrapper.setQualificationsData(qualificationsData);
			}

			List<Profession> listOfProfession = dataDisplayService.fetchProfessionData();
			if (listOfProfession != null && !listOfProfession.isEmpty()) {
				ProfessionalData professionalData = null;
				for (Profession profession : listOfProfession) {
					professionalData = new ProfessionalData();
					professionalData.setProfession_code(profession.getProfession_code());
					professionalData.setProfession_name(profession.getProfession_name());
					professionalData.setProfession_web_name(profession.getProfession_web_name());
					professionalsData.add(professionalData);
				}
				dataDisplayInfoWrapper.setProfessionalsData(professionalsData);
			}

		} catch (Exception e) {
			logger.error("Exception occured in Service :::: listDisplayData  :::: " + e.getMessage());
			buildSystemFailureError(dataDisplayInfoWrapper, SYSTEM_ERROR_MSG, errorInfoData, e);
		}
		return new ResponseEntity<DataDisplayInfoWrapper>(dataDisplayInfoWrapper, HttpStatus.OK);
	}

	@RequestMapping(value = "/listvvtdata/mandals/{stateCode}/{districtCode}", method = RequestMethod.GET, headers = "Accept=application/json", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<DataDisplayInfoWrapper> listMandalsData(@PathVariable("stateCode") String stateCode, @PathVariable("districtCode") String districtCode) {
		logger.info(">>>>> listStates >>>>");
		ErrorInfoData errorInfoData = new ErrorInfoData();
		DataDisplayInfoWrapper dataDisplayInfoWrapper = new DataDisplayInfoWrapper();
		List<MandalsData> mandalsData = new ArrayList<MandalsData>();

		try {
			List<Mandals> listOfMandals = dataDisplayService.fetchMandalsData(stateCode, districtCode);
			if (listOfMandals != null && !listOfMandals.isEmpty()) {
				MandalsData mandalData = null;
				for (Mandals mandals : listOfMandals) {
					mandalData = new MandalsData();
					mandalData.setMandal_code(mandals.getMandal_code());
					mandalData.setMandal_name(mandals.getMandal_name());
					mandalData.setMandal_web_name(mandals.getMandal_web_name());
					mandalsData.add(mandalData);
				}
				Collections.sort(mandalsData, MandalsData.MandalsDataCompareByName);
				dataDisplayInfoWrapper.setMandalsData(mandalsData);
			}
			if (mandalsData.isEmpty()) {
				buildSystemFailureError(dataDisplayInfoWrapper, DATA_NOT_AVAILABLE_MSG, errorInfoData, null);
			}
		} catch (Exception e) {
			logger.error("Exception occured in Service :::: listMandalsData  :::: " + e.getMessage());
			buildSystemFailureError(dataDisplayInfoWrapper, SYSTEM_ERROR_MSG, errorInfoData, e);
		}
		return new ResponseEntity<DataDisplayInfoWrapper>(dataDisplayInfoWrapper, HttpStatus.OK);
	}

	public void buildSystemFailureError(DataDisplayInfoWrapper dataDisplayInfoWrapper, String errorMessage, ErrorInfoData errorInfoData, Exception e) {
		errorInfoData.addErrorInfo(errorMessage);
		if (e != null && e.getMessage() != null) {
			if (e.getMessage().length() > 50) {
				errorInfoData.addErrorInfo(e.getMessage().substring(0, 50));
			} else {
				errorInfoData.addErrorInfo(e.getMessage());
			}
		}
		dataDisplayInfoWrapper.setErrorInfoData(errorInfoData);
		dataDisplayInfoWrapper.setStatus("E");
	}

}
