package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryTopDataProperty extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryTopDataProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryTopDataProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryTopDataPropertyIterator theterritory = (territoryTopDataPropertyIterator)findAncestorWithClass(this, territoryTopDataPropertyIterator.class);
			pageContext.getOut().print(theterritory.getTopDataProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for topDataProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for topDataProperty tag ");
		}
		return SKIP_BODY;
	}
}

