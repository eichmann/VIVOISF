package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentGeographicFocusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentGeographicFocusType currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentGeographicFocusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GraduateStudentGeographicFocusIterator theGraduateStudentGeographicFocusIterator = (GraduateStudentGeographicFocusIterator)findAncestorWithClass(this, GraduateStudentGeographicFocusIterator.class);
			pageContext.getOut().print(theGraduateStudentGeographicFocusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

