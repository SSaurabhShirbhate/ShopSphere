package com.shopsphere.service;

import java.util.List;

import com.shopsphere.model.Home;
import com.shopsphere.model.HomeCategory;

public interface HomeService {

    Home creatHomePageData(List<HomeCategory> categories);

}
