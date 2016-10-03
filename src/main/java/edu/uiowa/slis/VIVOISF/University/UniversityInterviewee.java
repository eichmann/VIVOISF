package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UniversityInterviewee extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UniversityInterviewee currentInstance = null;
	private static final Log log = LogFactory.getLog(UniversityInterviewee.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UniversityIntervieweeIterator theUniversityIntervieweeIterator = (UniversityIntervieweeIterator)findAncestorWithClass(this, UniversityIntervieweeIterator.class);
			pageContext.getOut().print(theUniversityIntervieweeIterator.getInterviewee());
		} catch (Exception e) {
			log.error("Can't find enclosing University for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

