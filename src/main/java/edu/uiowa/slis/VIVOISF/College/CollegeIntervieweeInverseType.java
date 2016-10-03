package edu.uiowa.slis.VIVOISF.College;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollegeIntervieweeInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollegeIntervieweeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollegeIntervieweeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollegeIntervieweeInverseIterator theCollegeIntervieweeInverseIterator = (CollegeIntervieweeInverseIterator)findAncestorWithClass(this, CollegeIntervieweeInverseIterator.class);
			pageContext.getOut().print(theCollegeIntervieweeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing College for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

