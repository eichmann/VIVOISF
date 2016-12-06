package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalBFO_0000050 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalBFO_0000050 currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalBFO_0000050.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalBFO_0000050Iterator thePeriodicalBFO_0000050Iterator = (PeriodicalBFO_0000050Iterator)findAncestorWithClass(this, PeriodicalBFO_0000050Iterator.class);
			pageContext.getOut().print(thePeriodicalBFO_0000050Iterator.getBFO_0000050());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

