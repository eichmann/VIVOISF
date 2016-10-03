package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentDirectorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentDirectorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentDirectorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GraduateStudentDirectorInverseIterator theGraduateStudentDirectorInverseIterator = (GraduateStudentDirectorInverseIterator)findAncestorWithClass(this, GraduateStudentDirectorInverseIterator.class);
			pageContext.getOut().print(theGraduateStudentDirectorInverseIterator.getDirectorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for director tag ");
		}
		return SKIP_BODY;
	}
}

