package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionCodeFAOTERMIterator theNonAcademicPosition = (NonAcademicPositionCodeFAOTERMIterator)findAncestorWithClass(this, NonAcademicPositionCodeFAOTERMIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

