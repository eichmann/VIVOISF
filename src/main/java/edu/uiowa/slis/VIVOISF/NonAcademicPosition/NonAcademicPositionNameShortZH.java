package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionNameShortZHIterator theNonAcademicPosition = (NonAcademicPositionNameShortZHIterator)findAncestorWithClass(this, NonAcademicPositionNameShortZHIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}
