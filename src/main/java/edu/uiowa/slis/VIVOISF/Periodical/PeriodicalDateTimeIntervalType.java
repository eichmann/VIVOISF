package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalDateTimeIntervalType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalDateTimeIntervalType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalDateTimeIntervalType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalDateTimeIntervalIterator thePeriodicalDateTimeIntervalIterator = (PeriodicalDateTimeIntervalIterator)findAncestorWithClass(this, PeriodicalDateTimeIntervalIterator.class);
			pageContext.getOut().print(thePeriodicalDateTimeIntervalIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

