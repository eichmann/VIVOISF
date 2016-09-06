package edu.uiowa.slis.VIVOISF.Interview;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InterviewRO_0000057 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InterviewRO_0000057 currentInstance = null;
	private static final Log log = LogFactory.getLog(InterviewRO_0000057.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InterviewRO_0000057Iterator theInterviewRO_0000057Iterator = (InterviewRO_0000057Iterator)findAncestorWithClass(this, InterviewRO_0000057Iterator.class);
			pageContext.getOut().print(theInterviewRO_0000057Iterator.getRO_0000057());
		} catch (Exception e) {
			log.error("Can't find enclosing Interview for RO_0000057 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Interview for RO_0000057 tag ");
		}
		return SKIP_BODY;
	}
}

