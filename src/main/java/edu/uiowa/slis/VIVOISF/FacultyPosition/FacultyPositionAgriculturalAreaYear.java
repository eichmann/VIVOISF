package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionAgriculturalAreaYearIterator theFacultyPosition = (FacultyPositionAgriculturalAreaYearIterator)findAncestorWithClass(this, FacultyPositionAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theFacultyPosition.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

