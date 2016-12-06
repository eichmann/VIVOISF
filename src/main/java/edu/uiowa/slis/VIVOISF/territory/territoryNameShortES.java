package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryNameShortESIterator theterritory = (territoryNameShortESIterator)findAncestorWithClass(this, territoryNameShortESIterator.class);
			pageContext.getOut().print(theterritory.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

