package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalIAO_0000136Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalIAO_0000136Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalIAO_0000136Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalIAO_0000136Iterator thePeriodicalIAO_0000136Iterator = (PeriodicalIAO_0000136Iterator)findAncestorWithClass(this, PeriodicalIAO_0000136Iterator.class);
			pageContext.getOut().print(thePeriodicalIAO_0000136Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

