package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentOrcidId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentOrcidId currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentOrcidId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GraduateStudentOrcidIdIterator theGraduateStudent = (GraduateStudentOrcidIdIterator)findAncestorWithClass(this, GraduateStudentOrcidIdIterator.class);
			pageContext.getOut().print(theGraduateStudent.getOrcidId());
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for orcidId tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for orcidId tag ");
		}
		return SKIP_BODY;
	}
}

