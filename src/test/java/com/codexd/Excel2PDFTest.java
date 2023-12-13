package com.codexd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author fengxxc
 * @date 2022-12-08
 */
public class Excel2PDFTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void process() {
        try (InputStream is = Excel2PDF.class.getResourceAsStream("/reporte-de-evento-diciembre-2023.xlsx");
             OutputStream os = new FileOutputStream("mayilong_resume.pdf")
        ) {
            Excel2PDF.process(is, os, document -> {

            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void process2() {
        try (InputStream is = Excel2PDF.class.getResourceAsStream("/mayilong_resume2.xlsx");
             OutputStream os = new FileOutputStream("F:\\temp\\excel2pdf\\mayilong_resume2.pdf")
        ) {
            Excel2PDF.process(is, os, document -> {

            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}