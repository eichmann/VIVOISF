package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentProducerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentProducerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentProducerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudentProducerInverseIterator theUndergraduateStudentProducerInverseIterator = (UndergraduateStudentProducerInverseIterator)findAncestorWithClass(this, UndergraduateStudentProducerInverseIterator.class);
			pageContext.getOut().print(theUndergraduateStudentProducerInverseIterator.getProducerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for producer tag ");
		}
		return SKIP_BODY;
	}
}

