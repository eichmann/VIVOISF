package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionNameOfficialFRIterator theFacultyPosition = (FacultyPositionNameOfficialFRIterator)findAncestorWithClass(this, FacultyPositionNameOfficialFRIterator.class);
			pageContext.getOut().print(theFacultyPosition.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

