package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryIsSuccessorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryIsSuccessorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryIsSuccessorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			territoryIsSuccessorOfIterator theterritoryIsSuccessorOfIterator = (territoryIsSuccessorOfIterator)findAncestorWithClass(this, territoryIsSuccessorOfIterator.class);
			pageContext.getOut().print(theterritoryIsSuccessorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for isSuccessorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for isSuccessorOf tag ");
		}
		return SKIP_BODY;
	}
}

