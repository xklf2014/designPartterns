package com.story.designpatterns.adapter.zen.v2;

import com.story.designpatterns.adapter.zen.v1.IUserInfo;

import java.util.Map;

public class OuterUserInfo extends OuterUser implements IUserInfo {
    private Map baseInfo = super.getUserBaseInfo();
    private Map homeInfo = super.getUserHomeInfo();
    private Map officeInfo = super.getUserOfficeInfo();

    @Override
    public String getUserName() {
        return (String) baseInfo.get("username");
    }

    @Override
    public String getHomeAddress() {
        return (String) homeInfo.get("homeAddress");
    }

    @Override
    public String getMobileNumber() {
        return (String) baseInfo.get("mobileNumber");
    }

    @Override
    public String getOfficeTelNumber() {
        return (String) officeInfo.get("officeTelNumber");
    }

    @Override
    public String getJobPosition() {
        return (String) officeInfo.get("jobPosition");
    }

    @Override
    public String getHomeTelNumber() {
        return (String) homeInfo.get("homeTelPhoneNumber");
    }
}
