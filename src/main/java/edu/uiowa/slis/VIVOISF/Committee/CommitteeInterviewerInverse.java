package edu.uiowa.slis.VIVOISF.Committee;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommitteeInterviewerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommitteeInterviewerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CommitteeInterviewerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommitteeInterviewerInverseIterator theCommitteeInterviewerInverseIterator = (CommitteeInterviewerInverseIterator)findAncestorWithClass(this, CommitteeInterviewerInverseIterator.class);
			pageContext.getOut().print(theCommitteeInterviewerInverseIterator.getInterviewerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Committee for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Committee for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

