package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionCodeFAOSTATIterator theFacultyPosition = (FacultyPositionCodeFAOSTATIterator)findAncestorWithClass(this, FacultyPositionCodeFAOSTATIterator.class);
			pageContext.getOut().print(theFacultyPosition.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

