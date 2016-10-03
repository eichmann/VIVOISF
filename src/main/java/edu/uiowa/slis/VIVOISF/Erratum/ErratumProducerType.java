package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ErratumProducerIterator theErratumProducerIterator = (ErratumProducerIterator)findAncestorWithClass(this, ErratumProducerIterator.class);
			pageContext.getOut().print(theErratumProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for producer tag ");
		}
		return SKIP_BODY;
	}
}

