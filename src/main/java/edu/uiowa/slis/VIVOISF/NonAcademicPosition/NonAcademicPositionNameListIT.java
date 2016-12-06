package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionNameListITIterator theNonAcademicPosition = (NonAcademicPositionNameListITIterator)findAncestorWithClass(this, NonAcademicPositionNameListITIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

