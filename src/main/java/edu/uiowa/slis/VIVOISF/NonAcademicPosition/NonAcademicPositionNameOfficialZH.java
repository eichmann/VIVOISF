package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionNameOfficialZHIterator theNonAcademicPosition = (NonAcademicPositionNameOfficialZHIterator)findAncestorWithClass(this, NonAcademicPositionNameOfficialZHIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

