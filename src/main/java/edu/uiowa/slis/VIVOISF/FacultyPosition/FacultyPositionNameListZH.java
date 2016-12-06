package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionNameListZHIterator theFacultyPosition = (FacultyPositionNameListZHIterator)findAncestorWithClass(this, FacultyPositionNameListZHIterator.class);
			pageContext.getOut().print(theFacultyPosition.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

