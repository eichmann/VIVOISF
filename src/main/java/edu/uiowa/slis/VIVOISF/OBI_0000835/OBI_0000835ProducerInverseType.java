package edu.uiowa.slis.VIVOISF.OBI_0000835;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000835ProducerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000835ProducerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000835ProducerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0000835ProducerInverseIterator theOBI_0000835ProducerInverseIterator = (OBI_0000835ProducerInverseIterator)findAncestorWithClass(this, OBI_0000835ProducerInverseIterator.class);
			pageContext.getOut().print(theOBI_0000835ProducerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000835 for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000835 for producer tag ");
		}
		return SKIP_BODY;
	}
}

