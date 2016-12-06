package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionNameOfficialRUIterator theFacultyPosition = (FacultyPositionNameOfficialRUIterator)findAncestorWithClass(this, FacultyPositionNameOfficialRUIterator.class);
			pageContext.getOut().print(theFacultyPosition.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

