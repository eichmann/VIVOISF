package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentHasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentHasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentHasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentHasResearchAreaIterator theStudentHasResearchAreaIterator = (StudentHasResearchAreaIterator)findAncestorWithClass(this, StudentHasResearchAreaIterator.class);
			pageContext.getOut().print(theStudentHasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Student for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

