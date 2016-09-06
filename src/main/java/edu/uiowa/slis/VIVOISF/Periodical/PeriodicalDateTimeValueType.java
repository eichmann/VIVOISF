package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalDateTimeValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalDateTimeValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalDateTimeValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalDateTimeValueIterator thePeriodicalDateTimeValueIterator = (PeriodicalDateTimeValueIterator)findAncestorWithClass(this, PeriodicalDateTimeValueIterator.class);
			pageContext.getOut().print(thePeriodicalDateTimeValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

