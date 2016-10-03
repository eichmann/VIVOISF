package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmailProducerIterator theEmailProducerIterator = (EmailProducerIterator)findAncestorWithClass(this, EmailProducerIterator.class);
			pageContext.getOut().print(theEmailProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for producer tag ");
		}
		return SKIP_BODY;
	}
}

