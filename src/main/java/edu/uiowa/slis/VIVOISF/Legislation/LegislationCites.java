package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationCites extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationCites currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationCites.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegislationCitesIterator theLegislationCitesIterator = (LegislationCitesIterator)findAncestorWithClass(this, LegislationCitesIterator.class);
			pageContext.getOut().print(theLegislationCitesIterator.getCites());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for cites tag ");
		}
		return SKIP_BODY;
	}
}

