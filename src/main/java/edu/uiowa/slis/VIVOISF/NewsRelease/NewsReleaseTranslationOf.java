package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseTranslationOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseTranslationOf currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseTranslationOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseTranslationOfIterator theNewsReleaseTranslationOfIterator = (NewsReleaseTranslationOfIterator)findAncestorWithClass(this, NewsReleaseTranslationOfIterator.class);
			pageContext.getOut().print(theNewsReleaseTranslationOfIterator.getTranslationOf());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

