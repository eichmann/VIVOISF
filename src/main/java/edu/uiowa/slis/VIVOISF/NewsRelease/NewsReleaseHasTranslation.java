package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseHasTranslation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseHasTranslation currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseHasTranslation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseHasTranslationIterator theNewsReleaseHasTranslationIterator = (NewsReleaseHasTranslationIterator)findAncestorWithClass(this, NewsReleaseHasTranslationIterator.class);
			pageContext.getOut().print(theNewsReleaseHasTranslationIterator.getHasTranslation());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

