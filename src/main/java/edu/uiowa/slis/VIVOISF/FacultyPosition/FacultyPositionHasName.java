package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionHasName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionHasName currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionHasName.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionHasNameIterator theFacultyPositionHasNameIterator = (FacultyPositionHasNameIterator)findAncestorWithClass(this, FacultyPositionHasNameIterator.class);
			pageContext.getOut().print(theFacultyPositionHasNameIterator.getHasName());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for hasName tag ");
		}
		return SKIP_BODY;
	}
}

