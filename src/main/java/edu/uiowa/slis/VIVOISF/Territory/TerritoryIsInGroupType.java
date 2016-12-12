package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryIsInGroupType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryIsInGroupType currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryIsInGroupType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TerritoryIsInGroupIterator theTerritoryIsInGroupIterator = (TerritoryIsInGroupIterator)findAncestorWithClass(this, TerritoryIsInGroupIterator.class);
			pageContext.getOut().print(theTerritoryIsInGroupIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for isInGroup tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for isInGroup tag ");
		}
		return SKIP_BODY;
	}
}

