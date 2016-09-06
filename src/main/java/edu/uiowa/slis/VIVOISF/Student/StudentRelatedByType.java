package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentRelatedByIterator theStudentRelatedByIterator = (StudentRelatedByIterator)findAncestorWithClass(this, StudentRelatedByIterator.class);
			pageContext.getOut().print(theStudentRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Student for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

