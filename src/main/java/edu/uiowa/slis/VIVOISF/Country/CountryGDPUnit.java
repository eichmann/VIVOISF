package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryGDPUnitIterator theCountry = (CountryGDPUnitIterator)findAncestorWithClass(this, CountryGDPUnitIterator.class);
			pageContext.getOut().print(theCountry.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

