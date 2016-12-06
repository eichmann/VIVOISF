package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionCodeFAOTERMIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionCodeFAOTERMIterator)findAncestorWithClass(this, FacultyAdministrativePositionCodeFAOTERMIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

