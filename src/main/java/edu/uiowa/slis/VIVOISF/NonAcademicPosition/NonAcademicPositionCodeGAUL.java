package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionCodeGAULIterator theNonAcademicPosition = (NonAcademicPositionCodeGAULIterator)findAncestorWithClass(this, NonAcademicPositionCodeGAULIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

