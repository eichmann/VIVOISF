package edu.uiowa.slis.VIVOISF.IAO_0000013;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000013Producer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000013Producer currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000013Producer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000013ProducerIterator theIAO_0000013ProducerIterator = (IAO_0000013ProducerIterator)findAncestorWithClass(this, IAO_0000013ProducerIterator.class);
			pageContext.getOut().print(theIAO_0000013ProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000013 for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000013 for producer tag ");
		}
		return SKIP_BODY;
	}
}

