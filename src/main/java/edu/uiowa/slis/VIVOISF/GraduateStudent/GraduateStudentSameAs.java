package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentSameAs extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentSameAs currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentSameAs.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GraduateStudentSameAsIterator theGraduateStudent = (GraduateStudentSameAsIterator)findAncestorWithClass(this, GraduateStudentSameAsIterator.class);
			pageContext.getOut().print(theGraduateStudent.getSameAs());
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for sameAs tag ");
		}
		return SKIP_BODY;
	}
}

