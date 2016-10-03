package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationCourt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationCourt currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationCourt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegislationCourtIterator theLegislationCourtIterator = (LegislationCourtIterator)findAncestorWithClass(this, LegislationCourtIterator.class);
			pageContext.getOut().print(theLegislationCourtIterator.getCourt());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for court tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for court tag ");
		}
		return SKIP_BODY;
	}
}

