package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentNameShortZHIterator theContinent = (ContinentNameShortZHIterator)findAncestorWithClass(this, ContinentNameShortZHIterator.class);
			pageContext.getOut().print(theContinent.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

