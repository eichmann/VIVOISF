package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalSici currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalSiciIterator thePeriodical = (PeriodicalSiciIterator)findAncestorWithClass(this, PeriodicalSiciIterator.class);
			pageContext.getOut().print(thePeriodical.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for sici tag ");
		}
		return SKIP_BODY;
	}
}

