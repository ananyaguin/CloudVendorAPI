package com.technical.rest_demoo.service.impl;

import com.technical.rest_demoo.model.CloudVendor;
import com.technical.rest_demoo.repository.CloudVendorRepository;
import com.technical.rest_demoo.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CloudVendorServiceImpl implements CloudVendorService {


    CloudVendorRepository cloudVendorRepository;
    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }



    @Override
    public String createCloudVendor(CloudVendor cloudvendor) {
        cloudVendorRepository.save(cloudvendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudvendor) {
        cloudVendorRepository.save(cloudvendor);
        return "Success";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {

        cloudVendorRepository.deleteById(cloudVendorId);
        return "Successfully Deleted";
    }

    @Override
    public CloudVendor getCloudvendor(String CloudVendorId) {

        return cloudVendorRepository.findById(CloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendor() {
        return cloudVendorRepository.findAll();
    }
}
