package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionNameListFRIterator theFacultyPosition = (FacultyPositionNameListFRIterator)findAncestorWithClass(this, FacultyPositionNameListFRIterator.class);
			pageContext.getOut().print(theFacultyPosition.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

