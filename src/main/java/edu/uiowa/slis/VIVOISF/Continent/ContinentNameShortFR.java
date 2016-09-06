package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentNameShortFRIterator theContinent = (ContinentNameShortFRIterator)findAncestorWithClass(this, ContinentNameShortFRIterator.class);
			pageContext.getOut().print(theContinent.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

