package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalARG_2000028Iterator thePeriodicalARG_2000028Iterator = (PeriodicalARG_2000028Iterator)findAncestorWithClass(this, PeriodicalARG_2000028Iterator.class);
			pageContext.getOut().print(thePeriodicalARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

