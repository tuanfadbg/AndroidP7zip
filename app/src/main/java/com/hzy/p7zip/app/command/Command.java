package com.hzy.p7zip.app.command;

import com.hzy.p7zip.app.bean.FileInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huzongyao on 8/1/17.
 */

public class Command {

    public static String getExtractCmd(String archivePath, String outPath) {
        return String.format("7z x '%s' '-o%s' -aoa", archivePath, outPath);
    }

    public static String getCompressCmd(String filePath, String outPath, String type) {
        return String.format("7z a -t%s '%s' '%s'", type, outPath, filePath);
    }

    public static String getCompressCmd(List<FileInfo> fileInfos, String outPath, String type) {
        ArrayList<String> filePaths = new ArrayList<>();
        for (int i = 0; i < fileInfos.size(); i++) {
            filePaths.add(fileInfos.get(i).getFilePath());
        }
        return getCompressCmd(filePaths, outPath, type);
    }

    public static String getCompressCmd(ArrayList<String> filePaths, String outPath, String type) {
        StringBuilder command = new StringBuilder(String.format("7z a -t%s '%s'", type, outPath));

        for (int i = 0; i < filePaths.size(); i++) {
            command.append(" '").append(filePaths.get(i)).append("'");
        }
        return command.toString();
    }

    public static String getExtractPasswordCmd(String archivePath, String outPath, String password) {
        return String.format("7z x '%s' '-o%s' -aoa -p%s", archivePath, outPath, password);
    }

    public static String getCompressPasswordCmd(String filePath, String outPath, String type, String password) {
        return String.format("7z a -t%s '%s' '%s' -p%s", type, outPath, filePath, password);
    }

    public static String listFile(String filePath) {
        return String.format("7z l -slt '%s'", filePath);
    }
}
