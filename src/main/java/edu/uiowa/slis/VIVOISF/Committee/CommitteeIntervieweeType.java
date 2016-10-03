package edu.uiowa.slis.VIVOISF.Committee;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommitteeIntervieweeType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommitteeIntervieweeType currentInstance = null;
	private static final Log log = LogFactory.getLog(CommitteeIntervieweeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommitteeIntervieweeIterator theCommitteeIntervieweeIterator = (CommitteeIntervieweeIterator)findAncestorWithClass(this, CommitteeIntervieweeIterator.class);
			pageContext.getOut().print(theCommitteeIntervieweeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Committee for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Committee for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

