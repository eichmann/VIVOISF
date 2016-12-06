package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionNameListFRIterator theNonAcademicPosition = (NonAcademicPositionNameListFRIterator)findAncestorWithClass(this, NonAcademicPositionNameListFRIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

