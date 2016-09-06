package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GraduateStudentGeographicFocusIterator theGraduateStudentGeographicFocusIterator = (GraduateStudentGeographicFocusIterator)findAncestorWithClass(this, GraduateStudentGeographicFocusIterator.class);
			pageContext.getOut().print(theGraduateStudentGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

