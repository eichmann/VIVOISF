package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionNameListITIterator theFacultyPosition = (FacultyPositionNameListITIterator)findAncestorWithClass(this, FacultyPositionNameListITIterator.class);
			pageContext.getOut().print(theFacultyPosition.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

