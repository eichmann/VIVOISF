package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudentGeographicFocusIterator theUndergraduateStudentGeographicFocusIterator = (UndergraduateStudentGeographicFocusIterator)findAncestorWithClass(this, UndergraduateStudentGeographicFocusIterator.class);
			pageContext.getOut().print(theUndergraduateStudentGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

