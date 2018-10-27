package com.application.businessLogic;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

public class ImageFactory {

	public String move(MultipartFile mpf, String destination, String store_house,
			HttpServletRequest httpServletRequest) {

		String name = getName(mpf.toString()) + "_" + mpf.getOriginalFilename();
		String _path = destination + name;
		//System.out.println(_path);
		File save = new File(_path);
		try {
			try (InputStream inStream = mpf.getInputStream();
					BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(save));) {
				int i;
				while ((i = inStream.read()) != -1) {
					stream.write(i);
				}
				stream.flush();

			}
			return getBaseURL(httpServletRequest) + "//store//" + store_house + "//" + name;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new RuntimeException(e);
		}

	}

	public String moveImage(MultipartFile mpf, String destination) {

		try {
			String name = getName(mpf.toString());
			String _path = destination + name + "_" + mpf.getOriginalFilename();
			// Image img = ImageIO.read(new File(_path));

			byte fileBytes[] = mpf.getBytes();
			System.out.println(mpf.toString());
			System.out.println(name);
			Path path = Paths.get(_path);
			Files.write(path, fileBytes);
			// convertByteToImage(_path, fileBytes);
			return _path;
		} catch (Exception ex) {
			System.out.println("File Upload : " + ex.getMessage());
			throw new RuntimeException(ex);
		}

	}

	private void convertByteToImage(String _path, byte[] fileBytes) throws Exception {
		ByteArrayInputStream bai = new ByteArrayInputStream(fileBytes);
		BufferedImage buffered = ImageIO.read(bai);
		ImageIO.write(buffered, "png", new File(_path));
	}

	public Image viewImage(String _path) {
		try {
			File file = new File(_path);
			Image img = ImageIO.read(file);
			return img;

		} catch (Exception ex) {
			System.out.println("View Image : " + ex.getMessage());
			throw new RuntimeException(ex);
		}

	}

	protected String getName(String name) {
		String temp = "";
		boolean isFound = false;
		for (int i = 0; i < name.length(); ++i) {
			if (name.charAt(i) == '@') {
				isFound = true;
				continue;
			}
			if (isFound) {
				temp += name.charAt(i);
			}
		}
		return temp;
	}

	public String getBaseURL(HttpServletRequest request) {
		return request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
				+ request.getContextPath();
	}

}
