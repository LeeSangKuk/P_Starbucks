package com.team.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class UploadController {
//	// 파일 업로드 화면(upload.jsp) 띄우기
//	@GetMapping("upload")
//	public void uploadForm() {
//		System.out.println("파일 업로드 화면");
//	}
	

	
//	// 파일 전송 버튼을 누르면 파일 업로드
//	@PostMapping("uploadAction")
//	public void uploadAction(MultipartFile[] uploadFile) {
//		
//		// 파일 업로드할 경로 지정
//		String uploadFolder = "C:\\Users\\GreenArt\\git\\upload";
//		
//		for(MultipartFile multipartFile : uploadFile) {
//			// 사용자가 업로드한 실제 파일 이름
//			System.out.println("MultipartFile name = " + multipartFile.getOriginalFilename());
//			
//			// 사용자가 업로드한 실제 파일 크기
//			System.out.println("MultipartFile size = " + multipartFile.getSize());
//			
//			// 사용자가 업로드한 실제 파일 형식
//			System.out.println("MultipartFile type = " + multipartFile.getContentType());
//			
//			// file 입출력을 담당하는 File 클래스를 활용해서
//			// uploadFolder에 저장되어 있는 경로로 실제 파일명(multipartFile.getOriginalFilename())으로 저장
//			File saveFile = new File(uploadFolder,multipartFile.getOriginalFilename());
//			
//			// transferTo를 사용하기 위해서 예외 처리 해주었음
//			try {
//				multipartFile.transferTo(saveFile);
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			
//		}
//
//	}
	
	@GetMapping("uploadAjax")
	public void uploadAjaxForm(){
		System.out.println("파일 업로드 화면");
	}
	
	//-----------------------------------------------------------------
	// < 년/월/일 폴더를 생성 > 하기 위한 폴더 이름 추출하여 리턴
	// 실제로 폴더를 만드는 곳은 메서드 내부
	private String getFolder() {
		// 1.현재 날짜를 추출
		Date date = new Date(); // Tue Jan 18 09:34:09 KST 2022
		
		// 2.yyyy-MM-dd 형식으로 변경
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		sdf.format(date);
		
		// 3. yyyy-MM-dd -> yyyy\MM\dd 형식으로 변경(폴더 경로 만들기 위해서)
		String str = sdf.format(date);
		
		return str.replace("-", File.separator);
	}// private String getFolder() 끝

	
	
	
	
	
	//-----------------------------------------------------------------
	@PostMapping("uploadAjaxAction")
	public void uploadAjaxAction(MultipartFile[] uploadFile) {
		
		// 파일 업로드 경로 지정
		String uploadFolder = "C:\\Users\\GreenArt\\git\\upload";
		
		// * 년/월/일 폴더를 생성 *
		// 폴더 생성                                (기존 폴더 경로 + 현재 만들 폴더 결합)
		File uploadPath = new File(uploadFolder, getFolder());
		System.out.println("uploadPath = " + uploadPath);
		
		// 현재 만드려고 하는 폴더가 없으면
		if(uploadPath.exists()==false) {
			// 폴더 생성
			// .mkdirs() = makeDirectories
			uploadPath.mkdirs();
		}
		
		//---------------------------------------
		// 파일 정보를 불러오는 for문
		for(MultipartFile multipartFile : uploadFile) {
			// 사용자가 업로드 한 실제 파일 이름
			System.out.println("MultipartFile/name = " + multipartFile.getOriginalFilename());
			
			// 사용자가 업로드 한 실제 파일 크기
			System.out.println("MultipartFile/size = " + multipartFile.getSize());
			
			// 사용자가 업로드 한 실제 파일 형식
			System.out.println("MultipartFile/type = " + multipartFile.getContentType());
			
			//---------------------------------------
			// * uuid(다른 이름)으로 파일 업로드 *
			// 1. uuid를 사용하기 위해서 생성(실제 파일명을 저장하는 변수)
			String uploadFileName = multipartFile.getOriginalFilename();
			
			// 2. 중복이 되지않는 문자열 생성
			UUID uuid = UUID.randomUUID();
			
			// 3. UUID + "_" + getOriginalFilename()의 조합으로 파일명 생성
			uploadFileName = uuid.toString() + "_" + uploadFileName;
			
			//---------------------------------------
			// File 클래스 : 자바에서 file 입출력을 담당하는 클래스, 기본 생성자 없음
			// uploadFolder에 저장되어 있는 경로로 실제 파일명(multipartFile.getOriginalFilename())으로 저장
			File saveFile = new File(uploadPath, uploadFileName);
			
			// multipartFile.transferTo(saveFile)를 사용하기 위해서 예외처리 해주었음
			try {
				multipartFile.transferTo(saveFile);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}
	
	
	
}
