package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebpageProducerIterator theWebpageProducerIterator = (WebpageProducerIterator)findAncestorWithClass(this, WebpageProducerIterator.class);
			pageContext.getOut().print(theWebpageProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for producer tag ");
		}
		return SKIP_BODY;
	}
}

