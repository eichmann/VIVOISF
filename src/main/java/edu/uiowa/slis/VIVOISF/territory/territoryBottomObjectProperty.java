package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryBottomObjectProperty extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryBottomObjectProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryBottomObjectProperty.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			territoryBottomObjectPropertyIterator theterritoryBottomObjectPropertyIterator = (territoryBottomObjectPropertyIterator)findAncestorWithClass(this, territoryBottomObjectPropertyIterator.class);
			pageContext.getOut().print(theterritoryBottomObjectPropertyIterator.getBottomObjectProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for bottomObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for bottomObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

