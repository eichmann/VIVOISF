package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentNameShortARIterator theContinent = (ContinentNameShortARIterator)findAncestorWithClass(this, ContinentNameShortARIterator.class);
			pageContext.getOut().print(theContinent.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

