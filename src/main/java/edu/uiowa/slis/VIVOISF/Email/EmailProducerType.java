package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmailProducerIterator theEmailProducerIterator = (EmailProducerIterator)findAncestorWithClass(this, EmailProducerIterator.class);
			pageContext.getOut().print(theEmailProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for producer tag ");
		}
		return SKIP_BODY;
	}
}

