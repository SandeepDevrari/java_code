import java.awt.Dimension;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.opc.PackagePart;

/**
 * Demonstrates how you can extract data from a .pptx file
 */
public final class PPTtoJava {

    public static void main(String args[]) throws IOException, OpenXML4JException {

        PrintStream out = System.out;

        if (args.length == 0) {
           out.println("Input file is required");
           return;
        }
        
        FileInputStream is = new FileInputStream(args[0]);
        try (XMLSlideShow ppt = new XMLSlideShow(is)) {
            is.close();

            // Get the document's embedded files.
            for (PackagePart p : ppt.getAllEmbedds()) {
                String type = p.getContentType();
                // typically file name
                String name = p.getPartName().getName();
                out.println("Embedded file (" + type + "): " + name);

                InputStream pIs = p.getInputStream();
                // make sense of the part data
                pIs.close();

            }

            // Get the document's embedded files.
            for (XSLFPictureData data : ppt.getPictureData()) {
                String type = data.getContentType();
                String name = data.getFileName();
                out.println("Picture (" + type + "): " + name);

                InputStream pIs = data.getInputStream();
                // make sense of the image data
                pIs.close();
            }

            // size of the canvas in points
            Dimension pageSize = ppt.getPageSize();
            out.println("Pagesize: " + pageSize);

            for (XSLFSlide slide : ppt.getSlides()) {
                for (XSLFShape shape : slide) {
                    if (shape instanceof XSLFTextShape) {
                        XSLFTextShape txShape = (XSLFTextShape) shape;
                        out.println(txShape.getText());
                    } else if (shape instanceof XSLFPictureShape) {
                        XSLFPictureShape pShape = (XSLFPictureShape) shape;
                        XSLFPictureData pData = pShape.getPictureData();
                        out.println(pData.getFileName());
                    } else {
                        out.println("Process me: " + shape.getClass());
                    }
                }
            }
        }
    }

}