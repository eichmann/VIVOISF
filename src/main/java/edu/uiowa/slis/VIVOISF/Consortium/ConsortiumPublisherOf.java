package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumPublisherOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumPublisherOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumPublisherOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConsortiumPublisherOfIterator theConsortiumPublisherOfIterator = (ConsortiumPublisherOfIterator)findAncestorWithClass(this, ConsortiumPublisherOfIterator.class);
			pageContext.getOut().print(theConsortiumPublisherOfIterator.getPublisherOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for publisherOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for publisherOf tag ");
		}
		return SKIP_BODY;
	}
}

