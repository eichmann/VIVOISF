package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalBFO_0000051 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalBFO_0000051 currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalBFO_0000051.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalBFO_0000051Iterator thePeriodicalBFO_0000051Iterator = (PeriodicalBFO_0000051Iterator)findAncestorWithClass(this, PeriodicalBFO_0000051Iterator.class);
			pageContext.getOut().print(thePeriodicalBFO_0000051Iterator.getBFO_0000051());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}
