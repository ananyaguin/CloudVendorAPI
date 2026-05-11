
package com.technical.rest_demoo.controller;

import com.technical.rest_demoo.model.CloudVendor;
import com.technical.rest_demoo.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

    private final CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    // Read specific cloud vendor details
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
        return cloudVendorService.getCloudvendor(vendorId);
    }

    // Read all cloud vendor details
    @GetMapping
    public List<CloudVendor> getAllCloudVendorDetails() {
        return cloudVendorService.getAllCloudVendor();
    }

    // Insert data
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudvendor) {

        cloudVendorService.createCloudVendor(cloudvendor);
        return "Cloud Vendor Created Successfully";
    }

    // Update data
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudvendor) {

        cloudVendorService.updateCloudVendor(cloudvendor);
        return "Cloud Vendor Updated Successfully";
    }

    // Delete data
    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId) {

        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud Vendor Deleted Successfully";
    }
}