package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionNationalityESIterator theFacultyPosition = (FacultyPositionNationalityESIterator)findAncestorWithClass(this, FacultyPositionNationalityESIterator.class);
			pageContext.getOut().print(theFacultyPosition.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

