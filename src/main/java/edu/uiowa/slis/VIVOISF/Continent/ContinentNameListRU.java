package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentNameListRUIterator theContinent = (ContinentNameListRUIterator)findAncestorWithClass(this, ContinentNameListRUIterator.class);
			pageContext.getOut().print(theContinent.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

