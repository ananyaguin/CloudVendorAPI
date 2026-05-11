
package com.technical.rest_demoo.controller;

import com.technical.rest_demoo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

    private CloudVendor getCloudVendor;

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable String vendorId) {
        return getCloudVendor;
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudvendor) {

        this.getCloudVendor = cloudvendor;

        return "Cloud Vendor Created Successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudvendor) {

        this.getCloudVendor = cloudvendor;
        return "Cloud Vendor Updated Successfully";

    }
    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId) {

        this.getCloudVendor = null;
        return "Cloud Vendor deleted Successfully";

    }

}
