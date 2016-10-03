package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseProducerIterator theNewsReleaseProducerIterator = (NewsReleaseProducerIterator)findAncestorWithClass(this, NewsReleaseProducerIterator.class);
			pageContext.getOut().print(theNewsReleaseProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for producer tag ");
		}
		return SKIP_BODY;
	}
}

