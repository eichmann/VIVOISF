package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalRO_0001025 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalRO_0001025 currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalRO_0001025.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalRO_0001025Iterator thePeriodicalRO_0001025Iterator = (PeriodicalRO_0001025Iterator)findAncestorWithClass(this, PeriodicalRO_0001025Iterator.class);
			pageContext.getOut().print(thePeriodicalRO_0001025Iterator.getRO_0001025());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

