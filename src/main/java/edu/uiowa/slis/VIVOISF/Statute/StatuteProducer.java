package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StatuteProducerIterator theStatuteProducerIterator = (StatuteProducerIterator)findAncestorWithClass(this, StatuteProducerIterator.class);
			pageContext.getOut().print(theStatuteProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for producer tag ");
		}
		return SKIP_BODY;
	}
}

