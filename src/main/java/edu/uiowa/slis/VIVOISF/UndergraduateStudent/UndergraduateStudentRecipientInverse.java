package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentRecipientInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentRecipientInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentRecipientInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudentRecipientInverseIterator theUndergraduateStudentRecipientInverseIterator = (UndergraduateStudentRecipientInverseIterator)findAncestorWithClass(this, UndergraduateStudentRecipientInverseIterator.class);
			pageContext.getOut().print(theUndergraduateStudentRecipientInverseIterator.getRecipientInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for recipient tag ");
		}
		return SKIP_BODY;
	}
}

