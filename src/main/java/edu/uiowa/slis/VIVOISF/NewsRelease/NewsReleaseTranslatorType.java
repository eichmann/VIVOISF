package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseTranslatorIterator theNewsReleaseTranslatorIterator = (NewsReleaseTranslatorIterator)findAncestorWithClass(this, NewsReleaseTranslatorIterator.class);
			pageContext.getOut().print(theNewsReleaseTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for translator tag ");
		}
		return SKIP_BODY;
	}
}

