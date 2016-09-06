package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentNameShortRUIterator theContinent = (ContinentNameShortRUIterator)findAncestorWithClass(this, ContinentNameShortRUIterator.class);
			pageContext.getOut().print(theContinent.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

