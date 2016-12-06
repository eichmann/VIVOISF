package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(KindCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindCountryAreaUnitIterator theKind = (KindCountryAreaUnitIterator)findAncestorWithClass(this, KindCountryAreaUnitIterator.class);
			pageContext.getOut().print(theKind.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

