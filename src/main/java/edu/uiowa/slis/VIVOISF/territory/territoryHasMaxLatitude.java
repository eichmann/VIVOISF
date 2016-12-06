package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryHasMaxLatitudeIterator theterritory = (territoryHasMaxLatitudeIterator)findAncestorWithClass(this, territoryHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theterritory.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

