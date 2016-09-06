package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryIsPredecessorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryIsPredecessorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryIsPredecessorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			territoryIsPredecessorOfIterator theterritoryIsPredecessorOfIterator = (territoryIsPredecessorOfIterator)findAncestorWithClass(this, territoryIsPredecessorOfIterator.class);
			pageContext.getOut().print(theterritoryIsPredecessorOfIterator.getIsPredecessorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for isPredecessorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for isPredecessorOf tag ");
		}
		return SKIP_BODY;
	}
}

