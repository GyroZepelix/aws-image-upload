package org.gyro.awsimageupload.datastore;

import org.gyro.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("bf799963-ae20-468c-bc01-14e16cfab26b"), "janegonzales", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("4d9ac5f7-c300-4b0b-8097-98f3f7f92a60"), "victorsmith", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }

}
