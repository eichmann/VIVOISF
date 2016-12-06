package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionNationalityITIterator theFacultyPosition = (FacultyPositionNationalityITIterator)findAncestorWithClass(this, FacultyPositionNationalityITIterator.class);
			pageContext.getOut().print(theFacultyPosition.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

