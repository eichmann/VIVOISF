package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryNameShortRUIterator theterritory = (territoryNameShortRUIterator)findAncestorWithClass(this, territoryNameShortRUIterator.class);
			pageContext.getOut().print(theterritory.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

