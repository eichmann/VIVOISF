package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UniversityInterviewerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UniversityInterviewerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(UniversityInterviewerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UniversityInterviewerInverseIterator theUniversityInterviewerInverseIterator = (UniversityInterviewerInverseIterator)findAncestorWithClass(this, UniversityInterviewerInverseIterator.class);
			pageContext.getOut().print(theUniversityInterviewerInverseIterator.getInterviewerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing University for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

