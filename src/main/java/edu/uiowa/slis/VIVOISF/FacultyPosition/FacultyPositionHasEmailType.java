package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionHasEmailIterator theFacultyPositionHasEmailIterator = (FacultyPositionHasEmailIterator)findAncestorWithClass(this, FacultyPositionHasEmailIterator.class);
			pageContext.getOut().print(theFacultyPositionHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

