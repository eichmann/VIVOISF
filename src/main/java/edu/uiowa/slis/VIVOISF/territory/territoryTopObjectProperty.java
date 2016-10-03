package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryTopObjectProperty extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryTopObjectProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryTopObjectProperty.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			territoryTopObjectPropertyIterator theterritoryTopObjectPropertyIterator = (territoryTopObjectPropertyIterator)findAncestorWithClass(this, territoryTopObjectPropertyIterator.class);
			pageContext.getOut().print(theterritoryTopObjectPropertyIterator.getTopObjectProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for topObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for topObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

