package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionNationalityFRIterator theFacultyPosition = (FacultyPositionNationalityFRIterator)findAncestorWithClass(this, FacultyPositionNationalityFRIterator.class);
			pageContext.getOut().print(theFacultyPosition.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

