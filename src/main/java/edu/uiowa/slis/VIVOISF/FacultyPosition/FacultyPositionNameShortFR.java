package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionNameShortFRIterator theFacultyPosition = (FacultyPositionNameShortFRIterator)findAncestorWithClass(this, FacultyPositionNameShortFRIterator.class);
			pageContext.getOut().print(theFacultyPosition.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

