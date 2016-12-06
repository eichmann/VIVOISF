package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionNameShortITIterator theFacultyPosition = (FacultyPositionNameShortITIterator)findAncestorWithClass(this, FacultyPositionNameShortITIterator.class);
			pageContext.getOut().print(theFacultyPosition.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

