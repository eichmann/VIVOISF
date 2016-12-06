package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionCodeAGROVOCIterator theNonAcademicPosition = (NonAcademicPositionCodeAGROVOCIterator)findAncestorWithClass(this, NonAcademicPositionCodeAGROVOCIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

