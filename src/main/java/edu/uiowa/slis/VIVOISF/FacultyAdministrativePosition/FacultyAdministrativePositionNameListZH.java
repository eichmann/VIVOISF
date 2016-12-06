package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionNameListZHIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionNameListZHIterator)findAncestorWithClass(this, FacultyAdministrativePositionNameListZHIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

