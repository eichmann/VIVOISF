package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentNameOfficialFRIterator theContinent = (ContinentNameOfficialFRIterator)findAncestorWithClass(this, ContinentNameOfficialFRIterator.class);
			pageContext.getOut().print(theContinent.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

