package com.eroberer;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IrisFile {

    private File file;

    public IrisFile(String filename) {
        file = new File(filename);
    }

    public List<Iris> getIrisDataList() {
        List<Iris> irisDataset = new ArrayList<>();

        try {
            Scanner scan = new Scanner(file);
            String[] irisInfo;

            while (scan.hasNext()) {
                irisInfo = scan.nextLine().split(",");
                IrisType irisType;

                switch (irisInfo[4]) {
                    case "Iris-setosa":
                        irisType = IrisType.SETOSA; break;
                    case "Iris-versicolor":
                        irisType = IrisType.VERSICOLOR; break;
                    case "Iris-virginica":
                        default: irisType = IrisType.VIRGINICA; break;
                }

                irisDataset.add(new Iris(
                        Double.parseDouble(irisInfo[0]),
                        Double.parseDouble(irisInfo[1]),
                        Double.parseDouble(irisInfo[2]),
                        Double.parseDouble(irisInfo[3]),
                        irisType
                ));
            }

        } catch (Exception e) {
            e.getStackTrace();
        }

        return irisDataset;
    }

}
