package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionCodeAGROVOCIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionCodeAGROVOCIterator)findAncestorWithClass(this, FacultyAdministrativePositionCodeAGROVOCIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

