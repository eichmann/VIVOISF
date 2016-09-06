package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentNameShortESIterator theContinent = (ContinentNameShortESIterator)findAncestorWithClass(this, ContinentNameShortESIterator.class);
			pageContext.getOut().print(theContinent.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

