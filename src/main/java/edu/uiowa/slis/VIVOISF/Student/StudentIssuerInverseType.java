package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentIssuerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentIssuerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentIssuerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentIssuerInverseIterator theStudentIssuerInverseIterator = (StudentIssuerInverseIterator)findAncestorWithClass(this, StudentIssuerInverseIterator.class);
			pageContext.getOut().print(theStudentIssuerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Student for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for issuer tag ");
		}
		return SKIP_BODY;
	}
}

