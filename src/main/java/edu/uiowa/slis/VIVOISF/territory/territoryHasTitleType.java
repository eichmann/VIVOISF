package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryHasTitleType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			territoryHasTitleIterator theterritoryHasTitleIterator = (territoryHasTitleIterator)findAncestorWithClass(this, territoryHasTitleIterator.class);
			pageContext.getOut().print(theterritoryHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

