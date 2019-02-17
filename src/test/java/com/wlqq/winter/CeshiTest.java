package com.wlqq.winter;

import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;


@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class CeshiTest extends WinterApplicationTests {

    @Autowired
    private OkHttpClient okHttpClient;

    @Test
    public void get() {
        Request request = new Request.Builder()
                .url("http://www.baidu.com")
                .build();
        try {
            Response response = okHttpClient.newCall(request).execute();
            log.info(response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
