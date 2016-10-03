package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryHasBorderWith extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryHasBorderWith currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryHasBorderWith.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			territoryHasBorderWithIterator theterritoryHasBorderWithIterator = (territoryHasBorderWithIterator)findAncestorWithClass(this, territoryHasBorderWithIterator.class);
			pageContext.getOut().print(theterritoryHasBorderWithIterator.getHasBorderWith());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for hasBorderWith tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for hasBorderWith tag ");
		}
		return SKIP_BODY;
	}
}

