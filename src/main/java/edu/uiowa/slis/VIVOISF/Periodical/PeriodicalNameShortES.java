package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalNameShortESIterator thePeriodical = (PeriodicalNameShortESIterator)findAncestorWithClass(this, PeriodicalNameShortESIterator.class);
			pageContext.getOut().print(thePeriodical.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

