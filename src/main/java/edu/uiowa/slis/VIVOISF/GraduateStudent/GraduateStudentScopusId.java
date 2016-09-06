package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentScopusId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentScopusId currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentScopusId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GraduateStudentScopusIdIterator theGraduateStudent = (GraduateStudentScopusIdIterator)findAncestorWithClass(this, GraduateStudentScopusIdIterator.class);
			pageContext.getOut().print(theGraduateStudent.getScopusId());
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for scopusId tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for scopusId tag ");
		}
		return SKIP_BODY;
	}
}

