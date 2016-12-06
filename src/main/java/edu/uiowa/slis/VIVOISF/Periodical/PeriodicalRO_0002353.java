package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalRO_0002353 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalRO_0002353 currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalRO_0002353.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalRO_0002353Iterator thePeriodicalRO_0002353Iterator = (PeriodicalRO_0002353Iterator)findAncestorWithClass(this, PeriodicalRO_0002353Iterator.class);
			pageContext.getOut().print(thePeriodicalRO_0002353Iterator.getRO_0002353());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

