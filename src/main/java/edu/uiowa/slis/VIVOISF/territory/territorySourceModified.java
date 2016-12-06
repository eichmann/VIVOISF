package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territorySourceModified extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territorySourceModified currentInstance = null;
	private static final Log log = LogFactory.getLog(territorySourceModified.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territorySourceModifiedIterator theterritory = (territorySourceModifiedIterator)findAncestorWithClass(this, territorySourceModifiedIterator.class);
			pageContext.getOut().print(theterritory.getSourceModified());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for sourceModified tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for sourceModified tag ");
		}
		return SKIP_BODY;
	}
}

