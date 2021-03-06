package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentNameOfficialRUIterator theContinent = (ContinentNameOfficialRUIterator)findAncestorWithClass(this, ContinentNameOfficialRUIterator.class);
			pageContext.getOut().print(theContinent.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

