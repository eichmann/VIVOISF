package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionNameListARIterator theNonAcademicPosition = (NonAcademicPositionNameListARIterator)findAncestorWithClass(this, NonAcademicPositionNameListARIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

