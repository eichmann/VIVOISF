package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionNameShortARIterator theNonAcademicPosition = (NonAcademicPositionNameShortARIterator)findAncestorWithClass(this, NonAcademicPositionNameShortARIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

