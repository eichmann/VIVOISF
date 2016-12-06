package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionHasURLIterator theFacultyAdministrativePositionHasURLIterator = (FacultyAdministrativePositionHasURLIterator)findAncestorWithClass(this, FacultyAdministrativePositionHasURLIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePositionHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

