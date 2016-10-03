package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefContributorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefContributorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefContributorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BriefContributorListIterator theBriefContributorListIterator = (BriefContributorListIterator)findAncestorWithClass(this, BriefContributorListIterator.class);
			pageContext.getOut().print(theBriefContributorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

