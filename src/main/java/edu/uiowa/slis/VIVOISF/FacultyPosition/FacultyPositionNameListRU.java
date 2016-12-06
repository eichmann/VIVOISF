package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionNameListRUIterator theFacultyPosition = (FacultyPositionNameListRUIterator)findAncestorWithClass(this, FacultyPositionNameListRUIterator.class);
			pageContext.getOut().print(theFacultyPosition.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

