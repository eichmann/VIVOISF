package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalRO_0002234 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalRO_0002234 currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalRO_0002234.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalRO_0002234Iterator thePeriodicalRO_0002234Iterator = (PeriodicalRO_0002234Iterator)findAncestorWithClass(this, PeriodicalRO_0002234Iterator.class);
			pageContext.getOut().print(thePeriodicalRO_0002234Iterator.getRO_0002234());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

