package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionNameListARIterator theFacultyPosition = (FacultyPositionNameListARIterator)findAncestorWithClass(this, FacultyPositionNameListARIterator.class);
			pageContext.getOut().print(theFacultyPosition.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

