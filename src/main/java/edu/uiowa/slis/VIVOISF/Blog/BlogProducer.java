package edu.uiowa.slis.VIVOISF.Blog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogProducerIterator theBlogProducerIterator = (BlogProducerIterator)findAncestorWithClass(this, BlogProducerIterator.class);
			pageContext.getOut().print(theBlogProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing Blog for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for producer tag ");
		}
		return SKIP_BODY;
	}
}

