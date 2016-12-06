package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryLandAreaUnitIterator theterritory = (territoryLandAreaUnitIterator)findAncestorWithClass(this, territoryLandAreaUnitIterator.class);
			pageContext.getOut().print(theterritory.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

