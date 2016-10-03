package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PatentProducerIterator thePatentProducerIterator = (PatentProducerIterator)findAncestorWithClass(this, PatentProducerIterator.class);
			pageContext.getOut().print(thePatentProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for producer tag ");
		}
		return SKIP_BODY;
	}
}

