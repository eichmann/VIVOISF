package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionNameOfficialITIterator theFacultyPosition = (FacultyPositionNameOfficialITIterator)findAncestorWithClass(this, FacultyPositionNameOfficialITIterator.class);
			pageContext.getOut().print(theFacultyPosition.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

