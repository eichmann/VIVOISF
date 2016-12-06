package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionNameShortARIterator theFacultyPosition = (FacultyPositionNameShortARIterator)findAncestorWithClass(this, FacultyPositionNameShortARIterator.class);
			pageContext.getOut().print(theFacultyPosition.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

