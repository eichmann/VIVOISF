package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territorySourceCreator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territorySourceCreator currentInstance = null;
	private static final Log log = LogFactory.getLog(territorySourceCreator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territorySourceCreatorIterator theterritory = (territorySourceCreatorIterator)findAncestorWithClass(this, territorySourceCreatorIterator.class);
			pageContext.getOut().print(theterritory.getSourceCreator());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for sourceCreator tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for sourceCreator tag ");
		}
		return SKIP_BODY;
	}
}

