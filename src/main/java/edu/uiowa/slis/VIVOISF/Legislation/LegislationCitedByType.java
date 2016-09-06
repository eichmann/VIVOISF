package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationCitedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationCitedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationCitedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegislationCitedByIterator theLegislationCitedByIterator = (LegislationCitedByIterator)findAncestorWithClass(this, LegislationCitedByIterator.class);
			pageContext.getOut().print(theLegislationCitedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

