package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalNameShortITIterator thePeriodical = (PeriodicalNameShortITIterator)findAncestorWithClass(this, PeriodicalNameShortITIterator.class);
			pageContext.getOut().print(thePeriodical.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

