package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryValidInInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryValidInInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryValidInInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			territoryValidInInverseIterator theterritoryValidInInverseIterator = (territoryValidInInverseIterator)findAncestorWithClass(this, territoryValidInInverseIterator.class);
			pageContext.getOut().print(theterritoryValidInInverseIterator.getValidInInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for validIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for validIn tag ");
		}
		return SKIP_BODY;
	}
}

