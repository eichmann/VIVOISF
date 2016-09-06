package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentValidSince extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentValidSince currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentValidSince.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentValidSinceIterator theContinent = (ContinentValidSinceIterator)findAncestorWithClass(this, ContinentValidSinceIterator.class);
			pageContext.getOut().print(theContinent.getValidSince());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for validSince tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for validSince tag ");
		}
		return SKIP_BODY;
	}
}

