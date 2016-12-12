package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryIsSuccessorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryIsSuccessorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryIsSuccessorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TerritoryIsSuccessorOfIterator theTerritoryIsSuccessorOfIterator = (TerritoryIsSuccessorOfIterator)findAncestorWithClass(this, TerritoryIsSuccessorOfIterator.class);
			pageContext.getOut().print(theTerritoryIsSuccessorOfIterator.getIsSuccessorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for isSuccessorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for isSuccessorOf tag ");
		}
		return SKIP_BODY;
	}
}

