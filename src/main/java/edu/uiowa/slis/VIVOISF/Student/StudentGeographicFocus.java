package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentGeographicFocusIterator theStudentGeographicFocusIterator = (StudentGeographicFocusIterator)findAncestorWithClass(this, StudentGeographicFocusIterator.class);
			pageContext.getOut().print(theStudentGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing Student for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

