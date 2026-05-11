package com.technical.rest_demoo.service;

import com.technical.rest_demoo.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {

    public String createCloudVendor(CloudVendor cloudvendor);
    public String updateCloudVendor(CloudVendor cloudvendor);
    public String deleteCloudVendor(String cloudVendorId);
    public CloudVendor getCloudvendor(String CloudVendorId);
    public List<CloudVendor> getAllCloudVendor();
}
