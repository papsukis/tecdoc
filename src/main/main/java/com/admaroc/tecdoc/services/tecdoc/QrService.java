package com.admaroc.tecdoc.services.tecdoc;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageConfig;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;

@Service
@Cacheable(cacheNames = "qr-code-cache", sync = true)
public class QrService {

    private static final Logger LOGGER = LoggerFactory.getLogger(QrService.class);

    public byte[] generateQRCode(String text, int width, int height) throws WriterException, IOException {


        LOGGER.info("Will generate image  text=[{}], width=[{}], height=[{}]", text, width, height);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        BitMatrix matrix = new MultiFormatWriter().encode(text, BarcodeFormat.QR_CODE, width, height);
        MatrixToImageWriter.writeToStream(matrix, MediaType.IMAGE_PNG.getSubtype(), baos, new MatrixToImageConfig());
        return baos.toByteArray();
    }

    public String byteToString(byte[] img){
        Base64.Encoder encoder = Base64.getEncoder();
        String base64Image = encoder.encodeToString(img);
        return "data:image/png;base64," + base64Image;
    }


   /* @Async
    public ListenableFuture<byte[]> generateQRCodeAsync(String text, int width, int height) throws Exception {
        return new AsyncResult<byte[]>(generateQRCode(text, width, height));
    }

    @CacheEvict(cacheNames = "qr-code-cache", allEntries = true)
    public void purgeCache() {
        LOGGER.info("Purging cache");
    }

    @SuppressWarnings("deprecation")
    private static String createQRCode(String qrCodeData, String filePath, String charset,
                                       @SuppressWarnings("rawtypes") Map hintMap, int qrCodeheight, int qrCodewidth)
            throws WriterException, IOException {
        @SuppressWarnings("unchecked")
        BitMatrix matrix = new MultiFormatWriter().encode(new String(qrCodeData.getBytes(charset), charset),
                BarcodeFormat.QR_CODE, qrCodewidth, qrCodeheight, hintMap);
        File file = new File(filePath);
        MatrixToImageWriter.writeToFile(matrix, filePath.substring(filePath.lastIndexOf('.') + 1), file);
        Base64.Encoder encoder = Base64.getEncoder();
        String base64Image = encoder.encodeToString(Files.readAllBytes(file.toPath()));
        return "data:image/png;base64," + base64Image;
    }*/
}