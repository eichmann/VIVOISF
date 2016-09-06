package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentRelatedByIterator theStudentRelatedByIterator = (StudentRelatedByIterator)findAncestorWithClass(this, StudentRelatedByIterator.class);
			pageContext.getOut().print(theStudentRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Student for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

