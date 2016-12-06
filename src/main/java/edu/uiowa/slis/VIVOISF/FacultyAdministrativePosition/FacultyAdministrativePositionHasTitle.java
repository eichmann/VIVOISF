package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionHasTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionHasTitleIterator theFacultyAdministrativePositionHasTitleIterator = (FacultyAdministrativePositionHasTitleIterator)findAncestorWithClass(this, FacultyAdministrativePositionHasTitleIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePositionHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

