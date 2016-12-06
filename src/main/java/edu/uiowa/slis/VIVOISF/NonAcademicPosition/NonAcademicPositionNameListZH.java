package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionNameListZHIterator theNonAcademicPosition = (NonAcademicPositionNameListZHIterator)findAncestorWithClass(this, NonAcademicPositionNameListZHIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

