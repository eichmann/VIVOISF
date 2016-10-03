package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebpageProducerIterator theWebpageProducerIterator = (WebpageProducerIterator)findAncestorWithClass(this, WebpageProducerIterator.class);
			pageContext.getOut().print(theWebpageProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for producer tag ");
		}
		return SKIP_BODY;
	}
}

