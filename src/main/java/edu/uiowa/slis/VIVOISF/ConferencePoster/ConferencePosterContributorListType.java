package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterContributorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterContributorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterContributorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterContributorListIterator theConferencePosterContributorListIterator = (ConferencePosterContributorListIterator)findAncestorWithClass(this, ConferencePosterContributorListIterator.class);
			pageContext.getOut().print(theConferencePosterContributorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

