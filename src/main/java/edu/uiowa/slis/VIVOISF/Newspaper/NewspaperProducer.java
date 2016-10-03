package edu.uiowa.slis.VIVOISF.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewspaperProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperProducerIterator theNewspaperProducerIterator = (NewspaperProducerIterator)findAncestorWithClass(this, NewspaperProducerIterator.class);
			pageContext.getOut().print(theNewspaperProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for producer tag ");
		}
		return SKIP_BODY;
	}
}

