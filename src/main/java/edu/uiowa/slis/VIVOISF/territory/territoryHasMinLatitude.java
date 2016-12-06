package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryHasMinLatitudeIterator theterritory = (territoryHasMinLatitudeIterator)findAncestorWithClass(this, territoryHasMinLatitudeIterator.class);
			pageContext.getOut().print(theterritory.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

