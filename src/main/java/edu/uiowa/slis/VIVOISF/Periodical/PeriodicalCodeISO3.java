package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalCodeISO3Iterator thePeriodical = (PeriodicalCodeISO3Iterator)findAncestorWithClass(this, PeriodicalCodeISO3Iterator.class);
			pageContext.getOut().print(thePeriodical.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

