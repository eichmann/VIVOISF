package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IssueVolumeIterator theIssue = (IssueVolumeIterator)findAncestorWithClass(this, IssueVolumeIterator.class);
			pageContext.getOut().print(theIssue.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for volume tag ");
		}
		return SKIP_BODY;
	}
}

