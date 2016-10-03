package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryBottomObjectPropertyInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryBottomObjectPropertyInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryBottomObjectPropertyInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			territoryBottomObjectPropertyInverseIterator theterritoryBottomObjectPropertyInverseIterator = (territoryBottomObjectPropertyInverseIterator)findAncestorWithClass(this, territoryBottomObjectPropertyInverseIterator.class);
			pageContext.getOut().print(theterritoryBottomObjectPropertyInverseIterator.getBottomObjectPropertyInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for bottomObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for bottomObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

