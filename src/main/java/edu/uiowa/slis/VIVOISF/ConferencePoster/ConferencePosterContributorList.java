package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterContributorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterContributorList currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterContributorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterContributorListIterator theConferencePosterContributorListIterator = (ConferencePosterContributorListIterator)findAncestorWithClass(this, ConferencePosterContributorListIterator.class);
			pageContext.getOut().print(theConferencePosterContributorListIterator.getContributorList());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

