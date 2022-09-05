import com.xiaokaixin.MinIOApplication;
import com.xiaokaixin.file.service.FileStorageService;
import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


@SpringBootTest(classes = MinIOApplication.class)
@RunWith(SpringRunner.class)
public class MinIOTest {


    public static void main(String[] args) {

        FileInputStream fileInputStream = null;
        try {

            fileInputStream =  new FileInputStream("/Users/xiaokaixin/Desktop/Graduation Project/黑马头条/day02-app端文章查看，静态化freemarker,分布式文件系统minIO/资料/模板文件/plugins/js/axios.min.js");;

            //1.创建minio链接客户端
            MinioClient minioClient = MinioClient.builder().credentials("minio", "minio123").endpoint("http://192.168.93.31:9000").build();
            //2.上传
            PutObjectArgs putObjectArgs = PutObjectArgs.builder()
                    .object("plugins/js/axios.min.js")//文件名
                    .contentType("text/js")//文件类型
                    .bucket("xiaokaixin-news")//桶名词  与minio创建的名词一致
                    .stream(fileInputStream, fileInputStream.available(), -1) //文件流
                    .build();
            minioClient.putObject(putObjectArgs);

            System.out.println("http://192.168.200.93:31/xiaokaixin-news/ak47.jpg");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    @Autowired
    FileStorageService fileStorageService;

    @Test
    public void testUpdateImgFile() {
        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/xiaokaixin/Desktop/1fdcfe27361eb099377fe814b92a66ba.jpg");
            String filePath = fileStorageService.uploadImgFile("", "1fdcfe27361eb099377fe814b92a66ba.jpg", fileInputStream);
            System.out.println(filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}