package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseAuthorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseAuthorList currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseAuthorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseAuthorListIterator theNewsReleaseAuthorListIterator = (NewsReleaseAuthorListIterator)findAncestorWithClass(this, NewsReleaseAuthorListIterator.class);
			pageContext.getOut().print(theNewsReleaseAuthorListIterator.getAuthorList());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for authorList tag ");
		}
		return SKIP_BODY;
	}
}

