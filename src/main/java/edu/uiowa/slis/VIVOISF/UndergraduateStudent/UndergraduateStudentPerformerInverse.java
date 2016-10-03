package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentPerformerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentPerformerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentPerformerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudentPerformerInverseIterator theUndergraduateStudentPerformerInverseIterator = (UndergraduateStudentPerformerInverseIterator)findAncestorWithClass(this, UndergraduateStudentPerformerInverseIterator.class);
			pageContext.getOut().print(theUndergraduateStudentPerformerInverseIterator.getPerformerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for performer tag ");
		}
		return SKIP_BODY;
	}
}

