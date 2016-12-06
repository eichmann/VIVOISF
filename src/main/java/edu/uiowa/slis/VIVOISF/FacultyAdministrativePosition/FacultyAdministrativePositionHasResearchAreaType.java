package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionHasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionHasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionHasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionHasResearchAreaIterator theFacultyAdministrativePositionHasResearchAreaIterator = (FacultyAdministrativePositionHasResearchAreaIterator)findAncestorWithClass(this, FacultyAdministrativePositionHasResearchAreaIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePositionHasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

