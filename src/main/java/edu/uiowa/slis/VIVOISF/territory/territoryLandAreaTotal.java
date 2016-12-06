package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryLandAreaTotalIterator theterritory = (territoryLandAreaTotalIterator)findAncestorWithClass(this, territoryLandAreaTotalIterator.class);
			pageContext.getOut().print(theterritory.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

