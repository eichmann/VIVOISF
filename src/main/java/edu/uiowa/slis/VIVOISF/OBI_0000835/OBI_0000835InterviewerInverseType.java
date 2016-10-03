package edu.uiowa.slis.VIVOISF.OBI_0000835;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000835InterviewerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000835InterviewerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000835InterviewerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0000835InterviewerInverseIterator theOBI_0000835InterviewerInverseIterator = (OBI_0000835InterviewerInverseIterator)findAncestorWithClass(this, OBI_0000835InterviewerInverseIterator.class);
			pageContext.getOut().print(theOBI_0000835InterviewerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000835 for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000835 for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

