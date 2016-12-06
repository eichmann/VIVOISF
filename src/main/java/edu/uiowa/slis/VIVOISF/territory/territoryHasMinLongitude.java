package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryHasMinLongitudeIterator theterritory = (territoryHasMinLongitudeIterator)findAncestorWithClass(this, territoryHasMinLongitudeIterator.class);
			pageContext.getOut().print(theterritory.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

