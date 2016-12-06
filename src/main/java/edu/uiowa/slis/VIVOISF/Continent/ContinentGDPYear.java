package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentGDPYearIterator theContinent = (ContinentGDPYearIterator)findAncestorWithClass(this, ContinentGDPYearIterator.class);
			pageContext.getOut().print(theContinent.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

