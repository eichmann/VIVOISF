package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionHasURLType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionHasURLType currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionHasURLType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionHasURLIterator theFacultyPositionHasURLIterator = (FacultyPositionHasURLIterator)findAncestorWithClass(this, FacultyPositionHasURLIterator.class);
			pageContext.getOut().print(theFacultyPositionHasURLIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

