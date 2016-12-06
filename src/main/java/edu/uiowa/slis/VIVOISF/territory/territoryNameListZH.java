package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryNameListZHIterator theterritory = (territoryNameListZHIterator)findAncestorWithClass(this, territoryNameListZHIterator.class);
			pageContext.getOut().print(theterritory.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

