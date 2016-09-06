package edu.uiowa.slis.VIVOISF.Interview;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InterviewBFO_0000055Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InterviewBFO_0000055Type currentInstance = null;
	private static final Log log = LogFactory.getLog(InterviewBFO_0000055Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InterviewBFO_0000055Iterator theInterviewBFO_0000055Iterator = (InterviewBFO_0000055Iterator)findAncestorWithClass(this, InterviewBFO_0000055Iterator.class);
			pageContext.getOut().print(theInterviewBFO_0000055Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Interview for BFO_0000055 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Interview for BFO_0000055 tag ");
		}
		return SKIP_BODY;
	}
}

