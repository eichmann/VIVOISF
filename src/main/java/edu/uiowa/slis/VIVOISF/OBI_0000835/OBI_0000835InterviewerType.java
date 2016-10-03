package edu.uiowa.slis.VIVOISF.OBI_0000835;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000835InterviewerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000835InterviewerType currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000835InterviewerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0000835InterviewerIterator theOBI_0000835InterviewerIterator = (OBI_0000835InterviewerIterator)findAncestorWithClass(this, OBI_0000835InterviewerIterator.class);
			pageContext.getOut().print(theOBI_0000835InterviewerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000835 for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000835 for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

