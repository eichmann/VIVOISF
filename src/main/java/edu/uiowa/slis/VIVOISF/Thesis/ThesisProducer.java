package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThesisProducerIterator theThesisProducerIterator = (ThesisProducerIterator)findAncestorWithClass(this, ThesisProducerIterator.class);
			pageContext.getOut().print(theThesisProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for producer tag ");
		}
		return SKIP_BODY;
	}
}

