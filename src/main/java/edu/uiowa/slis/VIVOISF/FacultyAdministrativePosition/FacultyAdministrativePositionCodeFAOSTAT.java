package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionCodeFAOSTATIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionCodeFAOSTATIterator)findAncestorWithClass(this, FacultyAdministrativePositionCodeFAOSTATIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

