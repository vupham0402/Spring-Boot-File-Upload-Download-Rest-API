package com.vupham0402.file_upload_download.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface FileUploadDownloadService {
    boolean storeFile(MultipartFile file);

    Resource loadFileByName(String fileName);
}
