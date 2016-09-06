package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentOrcidId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentOrcidId currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentOrcidId.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudentOrcidIdIterator theUndergraduateStudentOrcidIdIterator = (UndergraduateStudentOrcidIdIterator)findAncestorWithClass(this, UndergraduateStudentOrcidIdIterator.class);
			pageContext.getOut().print(theUndergraduateStudentOrcidIdIterator.getOrcidId());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for orcidId tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for orcidId tag ");
		}
		return SKIP_BODY;
	}
}

