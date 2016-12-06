package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionUrlIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionUrlIterator)findAncestorWithClass(this, FacultyAdministrativePositionUrlIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for url tag ");
		}
		return SKIP_BODY;
	}
}

