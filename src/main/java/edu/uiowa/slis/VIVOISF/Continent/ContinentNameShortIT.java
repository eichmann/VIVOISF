package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentNameShortITIterator theContinent = (ContinentNameShortITIterator)findAncestorWithClass(this, ContinentNameShortITIterator.class);
			pageContext.getOut().print(theContinent.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

