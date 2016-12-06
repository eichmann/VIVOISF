package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionDescriptionIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionDescriptionIterator)findAncestorWithClass(this, FacultyAdministrativePositionDescriptionIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for description tag ");
		}
		return SKIP_BODY;
	}
}

