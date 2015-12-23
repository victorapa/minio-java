/*
 * Minio Java Library for Amazon S3 Compatible Cloud Storage, (C) 2015 Minio, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


import io.minio.MinioClient;
import io.minio.acl.Acl;
import io.minio.errors.ClientException;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

public class MakeBucket {
  public static void main(String[] args) throws IOException, XmlPullParserException, ClientException {


    //  Note: YOUR-ACCESSKEYID, YOUR-SECRETACCESSKEY and my-bucketname are
    // dummy values, please replace them with original values.
    // Set s3 endpoint, region is calculated automatically
    MinioClient s3Client = new MinioClient("https://s3.amazonaws.com", "YOUR-ACCESSKEYID", "YOUR-SECRETACCESSKEY");

    // create bucket
    s3Client.makeBucket("my-bucketname");
  }
}
