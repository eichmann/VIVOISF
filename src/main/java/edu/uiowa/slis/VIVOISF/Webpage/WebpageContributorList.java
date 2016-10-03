package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageContributorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageContributorList currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageContributorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebpageContributorListIterator theWebpageContributorListIterator = (WebpageContributorListIterator)findAncestorWithClass(this, WebpageContributorListIterator.class);
			pageContext.getOut().print(theWebpageContributorListIterator.getContributorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

