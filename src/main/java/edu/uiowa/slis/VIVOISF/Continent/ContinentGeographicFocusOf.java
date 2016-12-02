package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentGeographicFocusOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentGeographicFocusOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentGeographicFocusOf.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentGeographicFocusOfIterator theContinent = (ContinentGeographicFocusOfIterator)findAncestorWithClass(this, ContinentGeographicFocusOfIterator.class);
			pageContext.getOut().print(theContinent.getGeographicFocusOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for geographicFocusOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for geographicFocusOf tag ");
		}
		return SKIP_BODY;
	}
}

