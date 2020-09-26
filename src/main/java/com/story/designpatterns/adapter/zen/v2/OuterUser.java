package com.story.designpatterns.adapter.zen.v2;

import com.story.designpatterns.adapter.zen.v1.IUserInfo;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUser {
    @Override
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("useranme","混世魔王");
        baseInfoMap.put("mobileNumber","13666666666");
        return baseInfoMap;
    }

    @Override
    public Map getUserOfficeInfo() {
        HashMap officeInfo = new HashMap();
        officeInfo.put("jobPosition","CTO");
        officeInfo.put("officeTelNumber","010-11111111");
        return officeInfo;
    }

    @Override
    public Map getUserHomeInfo() {
        HashMap homeInfoMap = new HashMap();
        homeInfoMap.put("homeTelPhoneNumber","021-66666666");
        homeInfoMap.put("homeAddress","世纪大道");
        return homeInfoMap;
    }
}
