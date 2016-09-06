package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseDocumentationForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseDocumentationForType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseDocumentationForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseDocumentationForIterator theNewsReleaseDocumentationForIterator = (NewsReleaseDocumentationForIterator)findAncestorWithClass(this, NewsReleaseDocumentationForIterator.class);
			pageContext.getOut().print(theNewsReleaseDocumentationForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

