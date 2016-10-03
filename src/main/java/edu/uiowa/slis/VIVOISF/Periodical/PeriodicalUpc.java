package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalUpcIterator thePeriodical = (PeriodicalUpcIterator)findAncestorWithClass(this, PeriodicalUpcIterator.class);
			pageContext.getOut().print(thePeriodical.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for upc tag ");
		}
		return SKIP_BODY;
	}
}

