package com.step.servlet;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class LandingPageTest {

    @Mock
    private
    HttpServletRequest request;

    @Mock
    private
    HttpServletResponse response;

    @Mock
    private
    PrintWriter printWriter;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testDoGet() throws Exception {
        when(response.getWriter()).thenReturn(printWriter);
        LandingPageServlet servlet = new LandingPageServlet();
        servlet.doGet(request, response);
        verify(printWriter).write("welcome!");
    }
}