package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionNameListESIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionNameListESIterator)findAncestorWithClass(this, FacultyAdministrativePositionNameListESIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

