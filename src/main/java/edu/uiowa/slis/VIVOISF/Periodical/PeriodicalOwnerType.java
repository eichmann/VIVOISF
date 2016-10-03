package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalOwnerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalOwnerType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalOwnerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalOwnerIterator thePeriodicalOwnerIterator = (PeriodicalOwnerIterator)findAncestorWithClass(this, PeriodicalOwnerIterator.class);
			pageContext.getOut().print(thePeriodicalOwnerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for owner tag ");
		}
		return SKIP_BODY;
	}
}

