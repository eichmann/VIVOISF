package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionNationalityRUIterator theFacultyPosition = (FacultyPositionNationalityRUIterator)findAncestorWithClass(this, FacultyPositionNationalityRUIterator.class);
			pageContext.getOut().print(theFacultyPosition.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

