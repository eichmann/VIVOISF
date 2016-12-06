package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionNameListESIterator theNonAcademicPosition = (NonAcademicPositionNameListESIterator)findAncestorWithClass(this, NonAcademicPositionNameListESIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

