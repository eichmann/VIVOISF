package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryTopObjectPropertyInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryTopObjectPropertyInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryTopObjectPropertyInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			territoryTopObjectPropertyInverseIterator theterritoryTopObjectPropertyInverseIterator = (territoryTopObjectPropertyInverseIterator)findAncestorWithClass(this, territoryTopObjectPropertyInverseIterator.class);
			pageContext.getOut().print(theterritoryTopObjectPropertyInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for topObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for topObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

