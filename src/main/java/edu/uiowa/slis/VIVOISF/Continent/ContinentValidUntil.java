package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentValidUntil extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentValidUntil currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentValidUntil.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentValidUntilIterator theContinent = (ContinentValidUntilIterator)findAncestorWithClass(this, ContinentValidUntilIterator.class);
			pageContext.getOut().print(theContinent.getValidUntil());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for validUntil tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for validUntil tag ");
		}
		return SKIP_BODY;
	}
}

