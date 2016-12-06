package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentLandAreaYearIterator theContinent = (ContinentLandAreaYearIterator)findAncestorWithClass(this, ContinentLandAreaYearIterator.class);
			pageContext.getOut().print(theContinent.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

