package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionCodeISO3Iterator theNonAcademicPosition = (NonAcademicPositionCodeISO3Iterator)findAncestorWithClass(this, NonAcademicPositionCodeISO3Iterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

