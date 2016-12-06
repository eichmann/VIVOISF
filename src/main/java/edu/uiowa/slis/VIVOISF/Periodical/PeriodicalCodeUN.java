package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalCodeUNIterator thePeriodical = (PeriodicalCodeUNIterator)findAncestorWithClass(this, PeriodicalCodeUNIterator.class);
			pageContext.getOut().print(thePeriodical.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

