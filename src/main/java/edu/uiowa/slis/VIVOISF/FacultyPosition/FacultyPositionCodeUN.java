package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionCodeUNIterator theFacultyPosition = (FacultyPositionCodeUNIterator)findAncestorWithClass(this, FacultyPositionCodeUNIterator.class);
			pageContext.getOut().print(theFacultyPosition.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

