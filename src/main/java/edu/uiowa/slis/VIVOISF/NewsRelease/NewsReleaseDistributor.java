package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseDistributor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseDistributor currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseDistributor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseDistributorIterator theNewsReleaseDistributorIterator = (NewsReleaseDistributorIterator)findAncestorWithClass(this, NewsReleaseDistributorIterator.class);
			pageContext.getOut().print(theNewsReleaseDistributorIterator.getDistributor());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for distributor tag ");
		}
		return SKIP_BODY;
	}
}

