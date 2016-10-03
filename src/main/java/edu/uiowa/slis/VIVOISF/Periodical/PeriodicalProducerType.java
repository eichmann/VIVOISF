package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalProducerIterator thePeriodicalProducerIterator = (PeriodicalProducerIterator)findAncestorWithClass(this, PeriodicalProducerIterator.class);
			pageContext.getOut().print(thePeriodicalProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for producer tag ");
		}
		return SKIP_BODY;
	}
}

