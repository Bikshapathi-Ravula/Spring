/*
 * package com.ctel.controller;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.HttpStatus; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.ctel.entity.ShipmentData; import
 * com.ctel.service.ShipmentDataService; import
 * com.fasterxml.jackson.core.JsonGenerationException; import
 * com.fasterxml.jackson.core.JsonProcessingException;
 * 
 * @RestController
 * 
 * @RequestMapping("/shipment-data") public class ShipmentDataController {
 * 
 * private final ShipmentDataService shipmentDataService;
 * 
 * @Autowired public ShipmentDataController(ShipmentDataService
 * shipmentDataService) { this.shipmentDataService = shipmentDataService; }
 * 
 * @GetMapping public ResponseEntity<List<ShipmentData>> getAllShipmentData() {
 * List<ShipmentData> allShipments = shipmentDataService.getAllShipments();
 * return ResponseEntity.ok(allShipments); } //
 * 
 * @GetMapping("/get{shipmentId}") public ResponseEntity<ShipmentData>
 * getShipmentDataById(@PathVariable String shipmentId) { ShipmentData
 * shipmentData = shipmentDataService.getByShipmentId(shipmentId); return
 * ResponseEntity.ok().body(shipmentData); }
 * 
 * @PostMapping("/send-to-kafka") public ResponseEntity<ShipmentData>
 * createShipmentData(@RequestBody ShipmentData shipmentData) throws
 * JsonGenerationException, JsonProcessingException { ShipmentData
 * createdShipmentData = shipmentDataService.createShipment(shipmentData);
 * return ResponseEntity.status(HttpStatus.CREATED).body(createdShipmentData); }
 * 
 * // @PutMapping("/{id}") // public ResponseEntity<ShipmentData>
 * updateShipmentData(@PathVariable String id, @RequestBody ShipmentData
 * updatedShipmentData) { // ShipmentData result =
 * shipmentDataService.updateShipment(id, updatedShipmentData); // return
 * ResponseEntity.ok(result); // } // // @DeleteMapping("/{id}") // public
 * ResponseEntity<Void> deleteShipmentData(@PathVariable String id) { //
 * shipmentDataService.deleteShipment(id); // return
 * ResponseEntity.noContent().build(); // } }
 */