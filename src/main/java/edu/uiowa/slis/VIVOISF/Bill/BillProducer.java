package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(BillProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BillProducerIterator theBillProducerIterator = (BillProducerIterator)findAncestorWithClass(this, BillProducerIterator.class);
			pageContext.getOut().print(theBillProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for producer tag ");
		}
		return SKIP_BODY;
	}
}
