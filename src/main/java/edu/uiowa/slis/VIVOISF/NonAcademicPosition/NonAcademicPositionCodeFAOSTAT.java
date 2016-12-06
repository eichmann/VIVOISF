package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionCodeFAOSTATIterator theNonAcademicPosition = (NonAcademicPositionCodeFAOSTATIterator)findAncestorWithClass(this, NonAcademicPositionCodeFAOSTATIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

