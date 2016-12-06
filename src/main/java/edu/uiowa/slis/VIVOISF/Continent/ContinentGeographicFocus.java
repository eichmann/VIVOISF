package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinentGeographicFocusIterator theContinentGeographicFocusIterator = (ContinentGeographicFocusIterator)findAncestorWithClass(this, ContinentGeographicFocusIterator.class);
			pageContext.getOut().print(theContinentGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

