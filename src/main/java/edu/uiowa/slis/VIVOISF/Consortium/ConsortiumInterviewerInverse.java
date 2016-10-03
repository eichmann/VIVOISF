package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumInterviewerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumInterviewerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumInterviewerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConsortiumInterviewerInverseIterator theConsortiumInterviewerInverseIterator = (ConsortiumInterviewerInverseIterator)findAncestorWithClass(this, ConsortiumInterviewerInverseIterator.class);
			pageContext.getOut().print(theConsortiumInterviewerInverseIterator.getInterviewerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

