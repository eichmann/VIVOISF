package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalHasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalHasAddressIterator thePeriodicalHasAddressIterator = (PeriodicalHasAddressIterator)findAncestorWithClass(this, PeriodicalHasAddressIterator.class);
			pageContext.getOut().print(thePeriodicalHasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

