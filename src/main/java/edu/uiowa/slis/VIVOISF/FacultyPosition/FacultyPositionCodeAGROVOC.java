package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionCodeAGROVOCIterator theFacultyPosition = (FacultyPositionCodeAGROVOCIterator)findAncestorWithClass(this, FacultyPositionCodeAGROVOCIterator.class);
			pageContext.getOut().print(theFacultyPosition.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

