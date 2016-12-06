package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryDescriptionIterator theterritory = (territoryDescriptionIterator)findAncestorWithClass(this, territoryDescriptionIterator.class);
			pageContext.getOut().print(theterritory.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for description tag ");
		}
		return SKIP_BODY;
	}
}

