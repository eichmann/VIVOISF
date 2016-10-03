package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalEanucc13Iterator thePeriodical = (PeriodicalEanucc13Iterator)findAncestorWithClass(this, PeriodicalEanucc13Iterator.class);
			pageContext.getOut().print(thePeriodical.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

