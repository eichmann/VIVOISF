package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalCodeFAOSTATIterator thePeriodical = (PeriodicalCodeFAOSTATIterator)findAncestorWithClass(this, PeriodicalCodeFAOSTATIterator.class);
			pageContext.getOut().print(thePeriodical.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

