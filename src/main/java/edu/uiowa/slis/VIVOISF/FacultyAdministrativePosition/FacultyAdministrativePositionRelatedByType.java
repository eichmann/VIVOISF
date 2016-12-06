package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionRelatedByIterator theFacultyAdministrativePositionRelatedByIterator = (FacultyAdministrativePositionRelatedByIterator)findAncestorWithClass(this, FacultyAdministrativePositionRelatedByIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePositionRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

