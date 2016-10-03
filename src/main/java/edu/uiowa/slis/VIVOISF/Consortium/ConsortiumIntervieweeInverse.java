package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumIntervieweeInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumIntervieweeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumIntervieweeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConsortiumIntervieweeInverseIterator theConsortiumIntervieweeInverseIterator = (ConsortiumIntervieweeInverseIterator)findAncestorWithClass(this, ConsortiumIntervieweeInverseIterator.class);
			pageContext.getOut().print(theConsortiumIntervieweeInverseIterator.getIntervieweeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

