package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IssueProducerIterator theIssueProducerIterator = (IssueProducerIterator)findAncestorWithClass(this, IssueProducerIterator.class);
			pageContext.getOut().print(theIssueProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for producer tag ");
		}
		return SKIP_BODY;
	}
}

