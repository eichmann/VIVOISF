package edu.uiowa.slis.VIVOISF.College;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollegeInterviewee extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollegeInterviewee currentInstance = null;
	private static final Log log = LogFactory.getLog(CollegeInterviewee.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollegeIntervieweeIterator theCollegeIntervieweeIterator = (CollegeIntervieweeIterator)findAncestorWithClass(this, CollegeIntervieweeIterator.class);
			pageContext.getOut().print(theCollegeIntervieweeIterator.getInterviewee());
		} catch (Exception e) {
			log.error("Can't find enclosing College for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

