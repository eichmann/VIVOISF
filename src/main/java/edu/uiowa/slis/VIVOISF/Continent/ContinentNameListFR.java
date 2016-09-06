package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentNameListFRIterator theContinent = (ContinentNameListFRIterator)findAncestorWithClass(this, ContinentNameListFRIterator.class);
			pageContext.getOut().print(theContinent.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

