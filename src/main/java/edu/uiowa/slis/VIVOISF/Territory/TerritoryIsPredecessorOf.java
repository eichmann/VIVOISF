package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryIsPredecessorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryIsPredecessorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryIsPredecessorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TerritoryIsPredecessorOfIterator theTerritoryIsPredecessorOfIterator = (TerritoryIsPredecessorOfIterator)findAncestorWithClass(this, TerritoryIsPredecessorOfIterator.class);
			pageContext.getOut().print(theTerritoryIsPredecessorOfIterator.getIsPredecessorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for isPredecessorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for isPredecessorOf tag ");
		}
		return SKIP_BODY;
	}
}

