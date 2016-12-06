package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionCodeFAOTERMIterator theFacultyPosition = (FacultyPositionCodeFAOTERMIterator)findAncestorWithClass(this, FacultyPositionCodeFAOTERMIterator.class);
			pageContext.getOut().print(theFacultyPosition.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

