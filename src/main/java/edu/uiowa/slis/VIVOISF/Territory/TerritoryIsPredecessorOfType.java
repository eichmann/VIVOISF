package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryIsPredecessorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryIsPredecessorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryIsPredecessorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TerritoryIsPredecessorOfIterator theTerritoryIsPredecessorOfIterator = (TerritoryIsPredecessorOfIterator)findAncestorWithClass(this, TerritoryIsPredecessorOfIterator.class);
			pageContext.getOut().print(theTerritoryIsPredecessorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for isPredecessorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for isPredecessorOf tag ");
		}
		return SKIP_BODY;
	}
}

