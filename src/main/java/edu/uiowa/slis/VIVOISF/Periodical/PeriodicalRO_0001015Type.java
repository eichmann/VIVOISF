package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalRO_0001015Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalRO_0001015Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalRO_0001015Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalRO_0001015Iterator thePeriodicalRO_0001015Iterator = (PeriodicalRO_0001015Iterator)findAncestorWithClass(this, PeriodicalRO_0001015Iterator.class);
			pageContext.getOut().print(thePeriodicalRO_0001015Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for RO_0001015 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for RO_0001015 tag ");
		}
		return SKIP_BODY;
	}
}

