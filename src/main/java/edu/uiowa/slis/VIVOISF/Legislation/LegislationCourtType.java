package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationCourtType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationCourtType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationCourtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegislationCourtIterator theLegislationCourtIterator = (LegislationCourtIterator)findAncestorWithClass(this, LegislationCourtIterator.class);
			pageContext.getOut().print(theLegislationCourtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for court tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for court tag ");
		}
		return SKIP_BODY;
	}
}

