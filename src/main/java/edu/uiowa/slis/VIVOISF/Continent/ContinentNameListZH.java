package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentNameListZHIterator theContinent = (ContinentNameListZHIterator)findAncestorWithClass(this, ContinentNameListZHIterator.class);
			pageContext.getOut().print(theContinent.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

