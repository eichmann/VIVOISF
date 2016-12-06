package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalPublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPublisherIterator thePeriodicalPublisherIterator = (PeriodicalPublisherIterator)findAncestorWithClass(this, PeriodicalPublisherIterator.class);
			pageContext.getOut().print(thePeriodicalPublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for publisher tag ");
		}
		return SKIP_BODY;
	}
}

