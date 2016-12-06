package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentHDIYearIterator theContinent = (ContinentHDIYearIterator)findAncestorWithClass(this, ContinentHDIYearIterator.class);
			pageContext.getOut().print(theContinent.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

