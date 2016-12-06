package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryNameShortITIterator theterritory = (territoryNameShortITIterator)findAncestorWithClass(this, territoryNameShortITIterator.class);
			pageContext.getOut().print(theterritory.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

