package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryHasCoordinate extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryHasCoordinate currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryHasCoordinate.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryHasCoordinateIterator theterritory = (territoryHasCoordinateIterator)findAncestorWithClass(this, territoryHasCoordinateIterator.class);
			pageContext.getOut().print(theterritory.getHasCoordinate());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for hasCoordinate tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for hasCoordinate tag ");
		}
		return SKIP_BODY;
	}
}

