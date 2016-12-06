package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentAgriculturalAreaYearIterator theContinent = (ContinentAgriculturalAreaYearIterator)findAncestorWithClass(this, ContinentAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theContinent.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

