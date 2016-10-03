package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumInterviewerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumInterviewerType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumInterviewerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConsortiumInterviewerIterator theConsortiumInterviewerIterator = (ConsortiumInterviewerIterator)findAncestorWithClass(this, ConsortiumInterviewerIterator.class);
			pageContext.getOut().print(theConsortiumInterviewerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

