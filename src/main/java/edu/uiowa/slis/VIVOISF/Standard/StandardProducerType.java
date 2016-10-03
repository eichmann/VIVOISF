package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StandardProducerIterator theStandardProducerIterator = (StandardProducerIterator)findAncestorWithClass(this, StandardProducerIterator.class);
			pageContext.getOut().print(theStandardProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for producer tag ");
		}
		return SKIP_BODY;
	}
}

