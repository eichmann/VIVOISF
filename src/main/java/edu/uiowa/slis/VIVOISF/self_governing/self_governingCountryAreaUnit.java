package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingCountryAreaUnitIterator theself_governing = (self_governingCountryAreaUnitIterator)findAncestorWithClass(this, self_governingCountryAreaUnitIterator.class);
			pageContext.getOut().print(theself_governing.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

