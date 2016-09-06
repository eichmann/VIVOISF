package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudentRelatedByIterator theUndergraduateStudentRelatedByIterator = (UndergraduateStudentRelatedByIterator)findAncestorWithClass(this, UndergraduateStudentRelatedByIterator.class);
			pageContext.getOut().print(theUndergraduateStudentRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

