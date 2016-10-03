package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalOwnerIterator thePeriodicalOwnerIterator = (PeriodicalOwnerIterator)findAncestorWithClass(this, PeriodicalOwnerIterator.class);
			pageContext.getOut().print(thePeriodicalOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for owner tag ");
		}
		return SKIP_BODY;
	}
}

