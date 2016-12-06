package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryUrlIterator theterritory = (territoryUrlIterator)findAncestorWithClass(this, territoryUrlIterator.class);
			pageContext.getOut().print(theterritory.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for url tag ");
		}
		return SKIP_BODY;
	}
}

