package edu.uiowa.slis.VIVOISF.Committee;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommitteeInterviewerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommitteeInterviewerType currentInstance = null;
	private static final Log log = LogFactory.getLog(CommitteeInterviewerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommitteeInterviewerIterator theCommitteeInterviewerIterator = (CommitteeInterviewerIterator)findAncestorWithClass(this, CommitteeInterviewerIterator.class);
			pageContext.getOut().print(theCommitteeInterviewerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Committee for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Committee for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

