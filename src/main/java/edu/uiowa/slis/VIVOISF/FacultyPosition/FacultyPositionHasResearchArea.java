package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionHasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionHasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionHasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionHasResearchAreaIterator theFacultyPositionHasResearchAreaIterator = (FacultyPositionHasResearchAreaIterator)findAncestorWithClass(this, FacultyPositionHasResearchAreaIterator.class);
			pageContext.getOut().print(theFacultyPositionHasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

