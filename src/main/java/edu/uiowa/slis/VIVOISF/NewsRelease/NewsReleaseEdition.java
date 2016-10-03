package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseEditionIterator theNewsRelease = (NewsReleaseEditionIterator)findAncestorWithClass(this, NewsReleaseEditionIterator.class);
			pageContext.getOut().print(theNewsRelease.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for edition tag ");
		}
		return SKIP_BODY;
	}
}

