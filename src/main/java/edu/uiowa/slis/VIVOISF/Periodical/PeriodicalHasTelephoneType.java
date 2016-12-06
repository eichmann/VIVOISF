package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHasTelephoneType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalHasTelephoneType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHasTelephoneType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalHasTelephoneIterator thePeriodicalHasTelephoneIterator = (PeriodicalHasTelephoneIterator)findAncestorWithClass(this, PeriodicalHasTelephoneIterator.class);
			pageContext.getOut().print(thePeriodicalHasTelephoneIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

