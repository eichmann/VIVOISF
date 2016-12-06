package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionCodeUNDPIterator theNonAcademicPosition = (NonAcademicPositionCodeUNDPIterator)findAncestorWithClass(this, NonAcademicPositionCodeUNDPIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

