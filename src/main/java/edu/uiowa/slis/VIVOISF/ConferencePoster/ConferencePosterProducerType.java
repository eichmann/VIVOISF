package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterProducerIterator theConferencePosterProducerIterator = (ConferencePosterProducerIterator)findAncestorWithClass(this, ConferencePosterProducerIterator.class);
			pageContext.getOut().print(theConferencePosterProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for producer tag ");
		}
		return SKIP_BODY;
	}
}

