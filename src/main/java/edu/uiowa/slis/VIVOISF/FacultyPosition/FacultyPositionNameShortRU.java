package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionNameShortRUIterator theFacultyPosition = (FacultyPositionNameShortRUIterator)findAncestorWithClass(this, FacultyPositionNameShortRUIterator.class);
			pageContext.getOut().print(theFacultyPosition.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

