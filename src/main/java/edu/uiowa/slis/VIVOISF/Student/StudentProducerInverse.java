package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentProducerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentProducerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentProducerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentProducerInverseIterator theStudentProducerInverseIterator = (StudentProducerInverseIterator)findAncestorWithClass(this, StudentProducerInverseIterator.class);
			pageContext.getOut().print(theStudentProducerInverseIterator.getProducerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Student for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for producer tag ");
		}
		return SKIP_BODY;
	}
}

