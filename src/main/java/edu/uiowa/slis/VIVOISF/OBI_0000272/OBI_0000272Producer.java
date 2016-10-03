package edu.uiowa.slis.VIVOISF.OBI_0000272;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000272Producer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000272Producer currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000272Producer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0000272ProducerIterator theOBI_0000272ProducerIterator = (OBI_0000272ProducerIterator)findAncestorWithClass(this, OBI_0000272ProducerIterator.class);
			pageContext.getOut().print(theOBI_0000272ProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000272 for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000272 for producer tag ");
		}
		return SKIP_BODY;
	}
}

