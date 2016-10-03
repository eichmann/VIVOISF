package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProceedingsProducerIterator theProceedingsProducerIterator = (ProceedingsProducerIterator)findAncestorWithClass(this, ProceedingsProducerIterator.class);
			pageContext.getOut().print(theProceedingsProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for producer tag ");
		}
		return SKIP_BODY;
	}
}

