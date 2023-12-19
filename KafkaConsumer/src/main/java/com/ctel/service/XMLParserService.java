package com.ctel.service;

import java.io.StringReader;

import org.springframework.stereotype.Service;

import com.ctel.entity.PostRequest;
import com.ctel.entity.ShipmentData;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

@Service
public class XMLParserService {

	public ShipmentData convertXmlToJava(String xmlString) throws JsonMappingException, JsonProcessingException {
		
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(PostRequest.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

			StringReader reader = new StringReader(xmlString);
			PostRequest postRequest = (PostRequest) unmarshaller.unmarshal(reader);

			// Now you can access the objects in your XML
			System.out.println("ObjectType: " + postRequest.getObjectType());
			System.out.println("Location Id: " + postRequest.getLocationId());
			System.out.println("Destination Location Name: " + postRequest.getDestinationLocation());
			System.out.println("Location Type: " + postRequest.getLocationType());
			System.out.println("Source Location: " + postRequest.getSourceLocation());
			// Extract JSON from CDATA and parse it using Jackson
			String jsonPayload = postRequest.getPayload().toString();
			System.out.println("Payload: " +postRequest.getPayload());
			ObjectMapper objectMapper = new ObjectMapper();

			ShipmentData jsonClass = objectMapper.readValue(jsonPayload, ShipmentData.class);
			System.out.println(jsonClass.getShipments().toString());
			System.out.println(jsonClass.getShipments().getShipment().toString());
			// Access other fields and objects as needed
			System.out.println(jsonClass.toString());
			return jsonClass;

		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return null;
		
	}
}
