package edu.uiowa.slis.VIVOISF.UO_0000280;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UO_0000280HasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UO_0000280HasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(UO_0000280HasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UO_0000280HasResearchAreaIterator theUO_0000280HasResearchAreaIterator = (UO_0000280HasResearchAreaIterator)findAncestorWithClass(this, UO_0000280HasResearchAreaIterator.class);
			pageContext.getOut().print(theUO_0000280HasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing UO_0000280 for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing UO_0000280 for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

