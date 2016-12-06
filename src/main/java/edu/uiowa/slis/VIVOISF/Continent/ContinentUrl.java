package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentUrlIterator theContinent = (ContinentUrlIterator)findAncestorWithClass(this, ContinentUrlIterator.class);
			pageContext.getOut().print(theContinent.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for url tag ");
		}
		return SKIP_BODY;
	}
}

