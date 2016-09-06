package edu.uiowa.slis.VIVOISF.Committee;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommitteeAssigneeFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommitteeAssigneeFor currentInstance = null;
	private static final Log log = LogFactory.getLog(CommitteeAssigneeFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommitteeAssigneeForIterator theCommitteeAssigneeForIterator = (CommitteeAssigneeForIterator)findAncestorWithClass(this, CommitteeAssigneeForIterator.class);
			pageContext.getOut().print(theCommitteeAssigneeForIterator.getAssigneeFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Committee for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Committee for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

