package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LetterProducerIterator theLetterProducerIterator = (LetterProducerIterator)findAncestorWithClass(this, LetterProducerIterator.class);
			pageContext.getOut().print(theLetterProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for producer tag ");
		}
		return SKIP_BODY;
	}
}

