package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryNameListRUIterator theterritory = (territoryNameListRUIterator)findAncestorWithClass(this, territoryNameListRUIterator.class);
			pageContext.getOut().print(theterritory.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

