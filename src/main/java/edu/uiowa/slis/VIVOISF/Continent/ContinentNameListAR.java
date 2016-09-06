package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentNameListARIterator theContinent = (ContinentNameListARIterator)findAncestorWithClass(this, ContinentNameListARIterator.class);
			pageContext.getOut().print(theContinent.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

