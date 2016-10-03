package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalProducerIterator thePeriodicalProducerIterator = (PeriodicalProducerIterator)findAncestorWithClass(this, PeriodicalProducerIterator.class);
			pageContext.getOut().print(thePeriodicalProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for producer tag ");
		}
		return SKIP_BODY;
	}
}

