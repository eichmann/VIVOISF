package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionNameShortZHIterator theFacultyPosition = (FacultyPositionNameShortZHIterator)findAncestorWithClass(this, FacultyPositionNameShortZHIterator.class);
			pageContext.getOut().print(theFacultyPosition.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

