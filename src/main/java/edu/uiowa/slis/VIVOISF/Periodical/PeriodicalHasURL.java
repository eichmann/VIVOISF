package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalHasURLIterator thePeriodicalHasURLIterator = (PeriodicalHasURLIterator)findAncestorWithClass(this, PeriodicalHasURLIterator.class);
			pageContext.getOut().print(thePeriodicalHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

