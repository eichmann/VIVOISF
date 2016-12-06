package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionHasName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionHasName currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionHasName.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionHasNameIterator theFacultyAdministrativePositionHasNameIterator = (FacultyAdministrativePositionHasNameIterator)findAncestorWithClass(this, FacultyAdministrativePositionHasNameIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePositionHasNameIterator.getHasName());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for hasName tag ");
		}
		return SKIP_BODY;
	}
}

