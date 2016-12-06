package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionCodeISO2Iterator theNonAcademicPosition = (NonAcademicPositionCodeISO2Iterator)findAncestorWithClass(this, NonAcademicPositionCodeISO2Iterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

