package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionNameOfficialARIterator theFacultyPosition = (FacultyPositionNameOfficialARIterator)findAncestorWithClass(this, FacultyPositionNameOfficialARIterator.class);
			pageContext.getOut().print(theFacultyPosition.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

