package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentNameListESIterator theContinent = (ContinentNameListESIterator)findAncestorWithClass(this, ContinentNameListESIterator.class);
			pageContext.getOut().print(theContinent.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

