package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperContributorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperContributorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperContributorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperContributorListIterator theConferencePaperContributorListIterator = (ConferencePaperContributorListIterator)findAncestorWithClass(this, ConferencePaperContributorListIterator.class);
			pageContext.getOut().print(theConferencePaperContributorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

