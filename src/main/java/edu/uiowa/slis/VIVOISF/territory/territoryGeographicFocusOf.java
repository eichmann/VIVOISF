package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryGeographicFocusOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryGeographicFocusOf currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryGeographicFocusOf.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryGeographicFocusOfIterator theterritory = (territoryGeographicFocusOfIterator)findAncestorWithClass(this, territoryGeographicFocusOfIterator.class);
			pageContext.getOut().print(theterritory.getGeographicFocusOf());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for geographicFocusOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for geographicFocusOf tag ");
		}
		return SKIP_BODY;
	}
}

