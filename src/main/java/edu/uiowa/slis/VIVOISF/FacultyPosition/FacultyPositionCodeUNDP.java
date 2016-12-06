package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionCodeUNDPIterator theFacultyPosition = (FacultyPositionCodeUNDPIterator)findAncestorWithClass(this, FacultyPositionCodeUNDPIterator.class);
			pageContext.getOut().print(theFacultyPosition.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

