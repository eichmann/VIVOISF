package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExcerptProducerIterator theExcerptProducerIterator = (ExcerptProducerIterator)findAncestorWithClass(this, ExcerptProducerIterator.class);
			pageContext.getOut().print(theExcerptProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for producer tag ");
		}
		return SKIP_BODY;
	}
}
