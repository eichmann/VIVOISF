package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionCodeGAULIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionCodeGAULIterator)findAncestorWithClass(this, FacultyAdministrativePositionCodeGAULIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

