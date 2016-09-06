package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalDoiIterator thePeriodical = (PeriodicalDoiIterator)findAncestorWithClass(this, PeriodicalDoiIterator.class);
			pageContext.getOut().print(thePeriodical.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for doi tag ");
		}
		return SKIP_BODY;
	}
}

