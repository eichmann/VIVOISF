package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(KindCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindCountryAreaTotalIterator theKind = (KindCountryAreaTotalIterator)findAncestorWithClass(this, KindCountryAreaTotalIterator.class);
			pageContext.getOut().print(theKind.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

