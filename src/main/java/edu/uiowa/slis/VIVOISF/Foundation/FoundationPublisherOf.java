package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationPublisherOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationPublisherOf currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationPublisherOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FoundationPublisherOfIterator theFoundationPublisherOfIterator = (FoundationPublisherOfIterator)findAncestorWithClass(this, FoundationPublisherOfIterator.class);
			pageContext.getOut().print(theFoundationPublisherOfIterator.getPublisherOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for publisherOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for publisherOf tag ");
		}
		return SKIP_BODY;
	}
}

