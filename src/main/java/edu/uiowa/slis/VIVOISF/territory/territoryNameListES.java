package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryNameListESIterator theterritory = (territoryNameListESIterator)findAncestorWithClass(this, territoryNameListESIterator.class);
			pageContext.getOut().print(theterritory.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

