package com.qr.service;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

import org.springframework.stereotype.Service;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

@Service
class QrGenerator {
	ImageIO a() {
	String qrText = "java";
	int size = 200; // Size of the QR code image

	try
	{
		// Generate QR code
		Map<EncodeHintType, Object> hints = new HashMap<>();
		hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
		QRCodeWriter qrCodeWriter = new QRCodeWriter();
		BitMatrix bitMatrix = qrCodeWriter.encode(qrText, BarcodeFormat.QR_CODE, size, size, hints);
		BufferedImage qrImage = MatrixToImageWriter.toBufferedImage(bitMatrix);
		String folderPath = "C:\\qr\\sample13.tif";
		File outputFile = new File(folderPath);

		  ImageIO.write(qrImage, "png", outputFile);

		Thread.sleep(1000);
	}catch(
	Exception e)
	{
		e.printStackTrace();
	}
}
