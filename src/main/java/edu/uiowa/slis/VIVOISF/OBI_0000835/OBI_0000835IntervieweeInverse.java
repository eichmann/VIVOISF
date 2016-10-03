package edu.uiowa.slis.VIVOISF.OBI_0000835;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000835IntervieweeInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000835IntervieweeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000835IntervieweeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0000835IntervieweeInverseIterator theOBI_0000835IntervieweeInverseIterator = (OBI_0000835IntervieweeInverseIterator)findAncestorWithClass(this, OBI_0000835IntervieweeInverseIterator.class);
			pageContext.getOut().print(theOBI_0000835IntervieweeInverseIterator.getIntervieweeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000835 for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000835 for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

