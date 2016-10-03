package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseContributorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseContributorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseContributorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseContributorListIterator theNewsReleaseContributorListIterator = (NewsReleaseContributorListIterator)findAncestorWithClass(this, NewsReleaseContributorListIterator.class);
			pageContext.getOut().print(theNewsReleaseContributorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

