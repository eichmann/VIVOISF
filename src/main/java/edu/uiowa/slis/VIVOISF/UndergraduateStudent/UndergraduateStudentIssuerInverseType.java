package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentIssuerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentIssuerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentIssuerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudentIssuerInverseIterator theUndergraduateStudentIssuerInverseIterator = (UndergraduateStudentIssuerInverseIterator)findAncestorWithClass(this, UndergraduateStudentIssuerInverseIterator.class);
			pageContext.getOut().print(theUndergraduateStudentIssuerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for issuer tag ");
		}
		return SKIP_BODY;
	}
}

