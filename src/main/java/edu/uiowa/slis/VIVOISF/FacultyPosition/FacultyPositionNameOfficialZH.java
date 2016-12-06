package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionNameOfficialZHIterator theFacultyPosition = (FacultyPositionNameOfficialZHIterator)findAncestorWithClass(this, FacultyPositionNameOfficialZHIterator.class);
			pageContext.getOut().print(theFacultyPosition.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

