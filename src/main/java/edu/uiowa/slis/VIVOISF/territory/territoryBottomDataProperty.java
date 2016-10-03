package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryBottomDataProperty extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryBottomDataProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryBottomDataProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryBottomDataPropertyIterator theterritory = (territoryBottomDataPropertyIterator)findAncestorWithClass(this, territoryBottomDataPropertyIterator.class);
			pageContext.getOut().print(theterritory.getBottomDataProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for bottomDataProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for bottomDataProperty tag ");
		}
		return SKIP_BODY;
	}
}

