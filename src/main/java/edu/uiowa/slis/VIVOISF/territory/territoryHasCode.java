package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryHasCode extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryHasCode currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryHasCode.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryHasCodeIterator theterritory = (territoryHasCodeIterator)findAncestorWithClass(this, territoryHasCodeIterator.class);
			pageContext.getOut().print(theterritory.getHasCode());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for hasCode tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for hasCode tag ");
		}
		return SKIP_BODY;
	}
}

