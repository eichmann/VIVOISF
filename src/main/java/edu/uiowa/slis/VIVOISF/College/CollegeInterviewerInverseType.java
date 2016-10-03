package edu.uiowa.slis.VIVOISF.College;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollegeInterviewerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollegeInterviewerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollegeInterviewerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollegeInterviewerInverseIterator theCollegeInterviewerInverseIterator = (CollegeInterviewerInverseIterator)findAncestorWithClass(this, CollegeInterviewerInverseIterator.class);
			pageContext.getOut().print(theCollegeInterviewerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing College for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

