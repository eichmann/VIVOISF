package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionHasTitleType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionHasTitleIterator theFacultyPositionHasTitleIterator = (FacultyPositionHasTitleIterator)findAncestorWithClass(this, FacultyPositionHasTitleIterator.class);
			pageContext.getOut().print(theFacultyPositionHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

