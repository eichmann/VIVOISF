package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationProducerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationProducerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationProducerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FoundationProducerInverseIterator theFoundationProducerInverseIterator = (FoundationProducerInverseIterator)findAncestorWithClass(this, FoundationProducerInverseIterator.class);
			pageContext.getOut().print(theFoundationProducerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for producer tag ");
		}
		return SKIP_BODY;
	}
}

