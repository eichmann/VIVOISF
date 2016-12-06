package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalRelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalRelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalRelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalRelatesIterator thePeriodicalRelatesIterator = (PeriodicalRelatesIterator)findAncestorWithClass(this, PeriodicalRelatesIterator.class);
			pageContext.getOut().print(thePeriodicalRelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for relates tag ");
		}
		return SKIP_BODY;
	}
}

