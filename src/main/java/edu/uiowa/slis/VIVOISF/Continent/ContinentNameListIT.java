package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentNameListITIterator theContinent = (ContinentNameListITIterator)findAncestorWithClass(this, ContinentNameListITIterator.class);
			pageContext.getOut().print(theContinent.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

