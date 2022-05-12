package tech.tresearchgroup.wrappers.mediainfo.model;

import lombok.Data;
import picocli.CommandLine;

@Data
public class MediaInfoOptions {
    @CommandLine.Option(names = "--h", description = "Display this help and exit")
    private boolean help;

    @CommandLine.Option(names = "--Help-Output", description = "Display help for Output= option")
    private boolean helpOutput;

    @CommandLine.Option(names = "--Version", description = "Display MediaInfo version and exit")
    private boolean version;

    @CommandLine.Option(names = "--Full", description = "Full information Display (all internal tags)")
    private boolean full;

    @CommandLine.Option(names = "--Output", description = "Full information Display with HTML tags")
    private String output;

    @CommandLine.Option(names = "--AcquisitionDataOutputMode", description = "Display Acquisition Data by segment then parameter (EBUCore and NISO Z39.87 outputs)")
    private String acquisitionDataOutputMode;

    @CommandLine.Option(names = "--ExternalMetadata", description = "Add external metadata to the output (EBUCore output)")
    private String externalMetadata;

    @CommandLine.Option(names = "--ExternalMetadataConfig", description = "Output template for external metadata (EBUCore output)")
    private String externalMetadataConfig;

    @CommandLine.Option(names = "--Info-Parameters", description = "Display list of Inform= parameters")
    private boolean infoParameters;

    @CommandLine.Option(names = "--Language", description = "Display non-translated unique identifiers (internal text)")
    private String language;

    @CommandLine.Option(names = "--Details", description = "Display mediatrace info")
    private String details;

    @CommandLine.Option(names = "--inform_version", description = "Add MediaInfoLib version to the text output")
    private String informVersion;

    @CommandLine.Option(names = "--inform_timestamp", description = "Add report creation timestamp to the text output")
    private String informTimestamp;

    @CommandLine.Option(names = "--File_TestContinuousFileNames", description = "Disable image sequence detection")
    private String fileTestContinuousFileNames;

    @CommandLine.Option(names = "--LogFile", description = "Save the output in the specified file")
    private String logFile;

    @CommandLine.Option(names = "--BOM", description = "Byte order mark for UTF-8 output")
    private boolean bom;

    @CommandLine.Option(names = "--Ssl_CertificateFileName", description = "File name of the SSL certificate. The default format is \"PEM\" and can be changed with --Ssl_CertificateFormat.")
    private String sslCertificateFileName;

    @CommandLine.Option(names = "--Ssl_CertificateFormat", description = "File format of the SSL certificate. Supported formats are \"PEM\" and \"DER\"")
    private String sslCertificateFormat;

    @CommandLine.Option(names = "--Ssl_PrivateKeyFileName", description = "File name of the SSL private key. The default format is \"PEM\" and can be changed with --Ssl_PrivateKeyFormat. Note: private key with a password is not supported.")
    private String sslPrivateKeyFileName;

    @CommandLine.Option(names = "--Ssl_PrivateKeyFormat", description = "File format of the SSL private key. Supported formats are \"PEM\" and \"DER\"")
    private String sslPrivateKeyFormat;

    @CommandLine.Option(names = "--Ssl_CertificateAuthorityFileName", description = "File name of the SSL certificate authorities to verify the peer with.")
    private String sslCertificateAuthorityFileName;

    @CommandLine.Option(names = "--Ssl_CertificateAuthorityPath", description = "Path of the SSL certificate authorities to verify the peer with.")
    private String sslCertificateAuthorityPath;

    @CommandLine.Option(names = "--Ssl_CertificateRevocationListFileName", description = "File name of the SSL certificate revocation list. The format is \"PEM\"")
    private String sslCertificateRevocationListFileName;

    @CommandLine.Option(names = "--Ssl_IgnoreSecurity", description = "Does not verify the authenticity of the peer's certificate. Use it at your own risks")
    private String sslIgnoreSecurity;

    @CommandLine.Option(names = "--Ssh_PublicKeyFileName", description = "File name of the SSH private key. Default is $HOME/.ssh/id_rsa.pub or $HOME/.ssh/id_dsa.pub if the HOME environment variable is set, and just \"id_rsa.pub\" or \"id_dsa.pub\" in the current directory if HOME is not set. Note: you need to set both public and private key.")
    private String sshPublicKeyFileName;

    @CommandLine.Option(names = "--Ssh_PrivateKeyFileName", description = "File name of the SSH private key. Default is $HOME/.ssh/id_rsa or $HOME/.ssh/id_dsa if the HOME environment variable is set, and just \"id_rsa\" or \"id_dsa\" in the current directory if HOME is not set. Note: you need to set both public and private key. Note: private key with a password is not supported.")
    private String sshPrivateKeyFileName;

    @CommandLine.Option(names = "--Ssh_KnownHostsFileName", description = "File name of the known hosts The format is the OpenSSH file format (libssh2) Default is $HOME/.ssh/known_hosts if the HOME environment variable is set, and just \"known_hosts\" in the current directory if HOME is not set.")
    private String sshKnownHostsFileName;

    @CommandLine.Option(names = "--Ssh_IgnoreSecurity", description = "Does not verify the authenticity of the peer (you don't need to accept the key with ssh first) Use it at your own risks")
    private boolean sshIgnoreSecurity;
}
