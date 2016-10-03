package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentProducerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentProducerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentProducerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudentProducerInverseIterator theUndergraduateStudentProducerInverseIterator = (UndergraduateStudentProducerInverseIterator)findAncestorWithClass(this, UndergraduateStudentProducerInverseIterator.class);
			pageContext.getOut().print(theUndergraduateStudentProducerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for producer tag ");
		}
		return SKIP_BODY;
	}
}

