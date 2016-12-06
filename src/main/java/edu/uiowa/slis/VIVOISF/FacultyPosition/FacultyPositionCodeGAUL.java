package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionCodeGAULIterator theFacultyPosition = (FacultyPositionCodeGAULIterator)findAncestorWithClass(this, FacultyPositionCodeGAULIterator.class);
			pageContext.getOut().print(theFacultyPosition.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

