package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryHasListName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryHasListName currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryHasListName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryHasListNameIterator theterritory = (territoryHasListNameIterator)findAncestorWithClass(this, territoryHasListNameIterator.class);
			pageContext.getOut().print(theterritory.getHasListName());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for hasListName tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for hasListName tag ");
		}
		return SKIP_BODY;
	}
}

