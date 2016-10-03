package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalIssuerIterator thePeriodicalIssuerIterator = (PeriodicalIssuerIterator)findAncestorWithClass(this, PeriodicalIssuerIterator.class);
			pageContext.getOut().print(thePeriodicalIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for issuer tag ");
		}
		return SKIP_BODY;
	}
}

