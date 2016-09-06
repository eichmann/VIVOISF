package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryIsInGroup extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryIsInGroup currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryIsInGroup.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			territoryIsInGroupIterator theterritoryIsInGroupIterator = (territoryIsInGroupIterator)findAncestorWithClass(this, territoryIsInGroupIterator.class);
			pageContext.getOut().print(theterritoryIsInGroupIterator.getIsInGroup());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for isInGroup tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for isInGroup tag ");
		}
		return SKIP_BODY;
	}
}

