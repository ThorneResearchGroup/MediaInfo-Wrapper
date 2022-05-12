package tech.tresearchgroup.wrappers.mediainfo;

import picocli.CommandLine;
import tech.tresearchgroup.wrappers.mediainfo.controller.MediaInfoController;
import tech.tresearchgroup.wrappers.mediainfo.model.MediaInfoOptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@CommandLine.Command(name = "MediaInfo", mixinStandardHelpOptions = true,
        description = "TRG MediaInfo wrapper")
public class Main implements Callable<Integer> {
    @CommandLine.Parameters(index = "0")
    private String file;

    @CommandLine.ArgGroup
    private MediaInfoOptions mediaInfoOptions;

    @Override
    public Integer call() {
        List<String> options = new ArrayList<>();
        options.add("mediainfo");
        if(mediaInfoOptions != null) {
            options.addAll(MediaInfoController.getOptions(mediaInfoOptions));
        }
        options.add(file);
        return execute(options);
    }

    public static void main(String... args) {
        int exitCode = new CommandLine(new Main()).execute(args);
        System.exit(exitCode);
    }

    public static int execute(List<String> options) {
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command(options);
        System.out.println(options);
        try {
            Process process = processBuilder.start();
            String line;
            /*
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
             */
            BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            while ((line = errorReader.readLine()) != null) {
                System.out.println(line);
            }
            errorReader.close();
            return process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return -1;
    }
}
