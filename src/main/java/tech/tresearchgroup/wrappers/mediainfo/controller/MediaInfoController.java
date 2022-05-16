package tech.tresearchgroup.wrappers.mediainfo.controller;

import tech.tresearchgroup.wrappers.mediainfo.model.MediaInfoOptions;

import java.util.ArrayList;
import java.util.List;

public class MediaInfoController {
    public static List<String> getOptions(MediaInfoOptions mediaInfoOptions) {
        List<String> optionsList = new ArrayList<>();
        if(mediaInfoOptions.isHelp()) {
            optionsList.add("-h");
        }
        if(mediaInfoOptions.isHelpOutput()) {
            optionsList.add("--Help-Output");
        }
        if(mediaInfoOptions.isVersion()) {
            optionsList.add("--Version");
        }
        if(mediaInfoOptions.isFull()) {
            optionsList.add("--Full");
        }
        if(mediaInfoOptions.getOutput() != null) {
            optionsList.add("--Output=" + mediaInfoOptions.getOutput());
        }
        if(mediaInfoOptions.getAcquisitionDataOutputMode() != null) {
            optionsList.add("--AcquisitionDataOutputMode");
            optionsList.add(mediaInfoOptions.getAcquisitionDataOutputMode());
        }
        if(mediaInfoOptions.getExternalMetadata() != null) {
            optionsList.add("--ExternalMetadata");
            optionsList.add(mediaInfoOptions.getExternalMetadata());
        }
        if(mediaInfoOptions.getExternalMetadataConfig() != null) {
            optionsList.add("--ExternalMetadataConfig");
            optionsList.add(mediaInfoOptions.getExternalMetadataConfig());
        }
        if(mediaInfoOptions.isInfoParameters()) {
            optionsList.add("--Info-Parameters");
        }
        if(mediaInfoOptions.getLanguage() != null) {
            optionsList.add("--Language");
            optionsList.add(mediaInfoOptions.getLanguage());
        }
        if(mediaInfoOptions.getDetails() != null) {
            optionsList.add("--Details");
            optionsList.add(mediaInfoOptions.getDetails());
        }
        if(mediaInfoOptions.getInformVersion() != null) {
            optionsList.add("--inform_version");
            optionsList.add(mediaInfoOptions.getInformVersion());
        }
        if(mediaInfoOptions.getInformTimestamp() != null) {
            optionsList.add("--inform_timestamp");
            optionsList.add(mediaInfoOptions.getInformTimestamp());
        }
        if(mediaInfoOptions.getFileTestContinuousFileNames() != null) {
            optionsList.add("--File_TestContinuousFileNames");
            optionsList.add(mediaInfoOptions.getFileTestContinuousFileNames());
        }
        if(mediaInfoOptions.getLogFile() != null) {
            optionsList.add("--LogFile");
            optionsList.add(mediaInfoOptions.getLogFile());
        }
        if(mediaInfoOptions.isBom()) {
            optionsList.add("--BOM");
        }
        if(mediaInfoOptions.getSslCertificateFileName() != null) {
            optionsList.add("--Ssl_CertificateFileName");
            optionsList.add(mediaInfoOptions.getSslCertificateFileName());
        }
        if(mediaInfoOptions.getSslCertificateFormat() != null) {
            optionsList.add("--Ssl_CertificateFormat");
            optionsList.add(mediaInfoOptions.getSslCertificateFormat());
        }
        if(mediaInfoOptions.getSslPrivateKeyFileName() != null) {
            optionsList.add("--Ssl_PrivateKeyFileName");
            optionsList.add(mediaInfoOptions.getSslPrivateKeyFileName());
        }
        if(mediaInfoOptions.getSslPrivateKeyFormat() != null) {
            optionsList.add("--Ssl_PrivateKeyFormat");
            optionsList.add(mediaInfoOptions.getSslPrivateKeyFormat());
        }
        if(mediaInfoOptions.getSslCertificateAuthorityFileName() != null) {
            optionsList.add("--Ssl_CertificateAuthorityFileName");
            optionsList.add(mediaInfoOptions.getSslCertificateAuthorityFileName());
        }
        if(mediaInfoOptions.getSslCertificateAuthorityPath() != null) {
            optionsList.add("--Ssl_CertificateAuthorityPath");
            optionsList.add(mediaInfoOptions.getSslCertificateAuthorityPath());
        }
        if(mediaInfoOptions.getSslCertificateRevocationListFileName() != null) {
            optionsList.add("--Ssl_CertificateRevocationListFileName");
            optionsList.add(mediaInfoOptions.getSslCertificateRevocationListFileName());
        }
        if(mediaInfoOptions.getSslIgnoreSecurity() != null) {
            optionsList.add("--Ssl_IgnoreSecurity");
            optionsList.add(mediaInfoOptions.getSslIgnoreSecurity());
        }
        if(mediaInfoOptions.getSshPublicKeyFileName() != null) {
            optionsList.add("--Ssh_PublicKeyFileName");
            optionsList.add(mediaInfoOptions.getSshPublicKeyFileName());
        }
        if(mediaInfoOptions.getSshPrivateKeyFileName() != null) {
            optionsList.add("--Ssh_PrivateKeyFileName");
            optionsList.add(mediaInfoOptions.getSshPrivateKeyFileName());
        }
        if(mediaInfoOptions.getSshKnownHostsFileName() != null) {
            optionsList.add("--Ssh_KnownHostsFileName");
            optionsList.add(mediaInfoOptions.getSshKnownHostsFileName());
        }
        if(mediaInfoOptions.isSshIgnoreSecurity()) {
            optionsList.add("--Ssh_IgnoreSecurity");
        }
        return optionsList;
    }
}
