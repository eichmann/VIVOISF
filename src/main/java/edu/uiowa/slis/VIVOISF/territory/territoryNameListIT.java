package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryNameListITIterator theterritory = (territoryNameListITIterator)findAncestorWithClass(this, territoryNameListITIterator.class);
			pageContext.getOut().print(theterritory.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

