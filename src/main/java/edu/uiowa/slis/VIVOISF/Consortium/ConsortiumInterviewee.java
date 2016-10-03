package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumInterviewee extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumInterviewee currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumInterviewee.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConsortiumIntervieweeIterator theConsortiumIntervieweeIterator = (ConsortiumIntervieweeIterator)findAncestorWithClass(this, ConsortiumIntervieweeIterator.class);
			pageContext.getOut().print(theConsortiumIntervieweeIterator.getInterviewee());
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

