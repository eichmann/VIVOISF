package edu.uiowa.slis.VIVOISF.Committee;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommitteeIntervieweeInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommitteeIntervieweeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CommitteeIntervieweeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommitteeIntervieweeInverseIterator theCommitteeIntervieweeInverseIterator = (CommitteeIntervieweeInverseIterator)findAncestorWithClass(this, CommitteeIntervieweeInverseIterator.class);
			pageContext.getOut().print(theCommitteeIntervieweeInverseIterator.getIntervieweeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Committee for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Committee for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

