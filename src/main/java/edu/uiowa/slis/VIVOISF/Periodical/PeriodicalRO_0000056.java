package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalRO_0000056Iterator thePeriodicalRO_0000056Iterator = (PeriodicalRO_0000056Iterator)findAncestorWithClass(this, PeriodicalRO_0000056Iterator.class);
			pageContext.getOut().print(thePeriodicalRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

