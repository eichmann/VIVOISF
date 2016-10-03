package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalLccnIterator thePeriodical = (PeriodicalLccnIterator)findAncestorWithClass(this, PeriodicalLccnIterator.class);
			pageContext.getOut().print(thePeriodical.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for lccn tag ");
		}
		return SKIP_BODY;
	}
}

