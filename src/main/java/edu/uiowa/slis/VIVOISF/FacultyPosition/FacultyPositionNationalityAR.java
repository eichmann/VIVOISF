package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionNationalityARIterator theFacultyPosition = (FacultyPositionNationalityARIterator)findAncestorWithClass(this, FacultyPositionNationalityARIterator.class);
			pageContext.getOut().print(theFacultyPosition.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

