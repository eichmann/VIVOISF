package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrcidId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrcidId currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrcidId.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentOrcidIdIterator theStudentOrcidIdIterator = (StudentOrcidIdIterator)findAncestorWithClass(this, StudentOrcidIdIterator.class);
			pageContext.getOut().print(theStudentOrcidIdIterator.getOrcidId());
		} catch (Exception e) {
			log.error("Can't find enclosing Student for orcidId tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for orcidId tag ");
		}
		return SKIP_BODY;
	}
}

