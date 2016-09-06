package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentERACommonsId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentERACommonsId currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentERACommonsId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GraduateStudentERACommonsIdIterator theGraduateStudent = (GraduateStudentERACommonsIdIterator)findAncestorWithClass(this, GraduateStudentERACommonsIdIterator.class);
			pageContext.getOut().print(theGraduateStudent.getERACommonsId());
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for eRACommonsId tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for eRACommonsId tag ");
		}
		return SKIP_BODY;
	}
}

