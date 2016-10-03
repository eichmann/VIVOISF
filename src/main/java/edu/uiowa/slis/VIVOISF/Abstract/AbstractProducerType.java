package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AbstractProducerIterator theAbstractProducerIterator = (AbstractProducerIterator)findAncestorWithClass(this, AbstractProducerIterator.class);
			pageContext.getOut().print(theAbstractProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for producer tag ");
		}
		return SKIP_BODY;
	}
}

