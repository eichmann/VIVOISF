package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionCodeUNDPIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionCodeUNDPIterator)findAncestorWithClass(this, FacultyAdministrativePositionCodeUNDPIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

