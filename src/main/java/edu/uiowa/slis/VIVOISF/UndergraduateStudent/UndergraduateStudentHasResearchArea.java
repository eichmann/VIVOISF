package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentHasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentHasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentHasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudentHasResearchAreaIterator theUndergraduateStudentHasResearchAreaIterator = (UndergraduateStudentHasResearchAreaIterator)findAncestorWithClass(this, UndergraduateStudentHasResearchAreaIterator.class);
			pageContext.getOut().print(theUndergraduateStudentHasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

