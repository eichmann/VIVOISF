package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryHasMaxLongitudeIterator theterritory = (territoryHasMaxLongitudeIterator)findAncestorWithClass(this, territoryHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theterritory.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

