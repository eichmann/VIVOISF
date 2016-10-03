package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UniversityIntervieweeInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UniversityIntervieweeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(UniversityIntervieweeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UniversityIntervieweeInverseIterator theUniversityIntervieweeInverseIterator = (UniversityIntervieweeInverseIterator)findAncestorWithClass(this, UniversityIntervieweeInverseIterator.class);
			pageContext.getOut().print(theUniversityIntervieweeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing University for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

