package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionNameShortITIterator theNonAcademicPosition = (NonAcademicPositionNameShortITIterator)findAncestorWithClass(this, NonAcademicPositionNameShortITIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

