package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueTranscriptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueTranscriptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueTranscriptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IssueTranscriptOfIterator theIssueTranscriptOfIterator = (IssueTranscriptOfIterator)findAncestorWithClass(this, IssueTranscriptOfIterator.class);
			pageContext.getOut().print(theIssueTranscriptOfIterator.getTranscriptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

