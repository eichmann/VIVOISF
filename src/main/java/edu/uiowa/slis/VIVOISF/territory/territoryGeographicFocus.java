package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			territoryGeographicFocusIterator theterritoryGeographicFocusIterator = (territoryGeographicFocusIterator)findAncestorWithClass(this, territoryGeographicFocusIterator.class);
			pageContext.getOut().print(theterritoryGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

