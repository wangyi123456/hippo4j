/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.hippo4j.common.toolkit;

import org.junit.Test;

public class FileUtilTest {

    @Test
    public void assertReadUtf8String() {
        String testText = "abcd简体繁体\uD83D\uDE04\uD83D\uDD25& *\n" +
                "second line\n" +
                "empty line next\n";
        String testFilePath = "test/test_utf8.txt";
        String contentByFileUtil = FileUtil.readUtf8String(testFilePath);
        Assert.isTrue(testText.equals(contentByFileUtil));
    }
}
