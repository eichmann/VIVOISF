package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionNameShortESIterator theFacultyPosition = (FacultyPositionNameShortESIterator)findAncestorWithClass(this, FacultyPositionNameShortESIterator.class);
			pageContext.getOut().print(theFacultyPosition.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

