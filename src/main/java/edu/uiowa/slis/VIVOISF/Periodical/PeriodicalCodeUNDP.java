package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalCodeUNDPIterator thePeriodical = (PeriodicalCodeUNDPIterator)findAncestorWithClass(this, PeriodicalCodeUNDPIterator.class);
			pageContext.getOut().print(thePeriodical.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

