package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionCodeUNIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionCodeUNIterator)findAncestorWithClass(this, FacultyAdministrativePositionCodeUNIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

