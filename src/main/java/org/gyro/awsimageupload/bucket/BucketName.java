package org.gyro.awsimageupload.bucket;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BucketName {
    PROFILE_IMAGE("org-gyro-aws-image-upload");

    private final String bucketName;
}
