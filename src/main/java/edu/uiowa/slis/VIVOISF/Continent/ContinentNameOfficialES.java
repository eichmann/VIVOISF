package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentNameOfficialESIterator theContinent = (ContinentNameOfficialESIterator)findAncestorWithClass(this, ContinentNameOfficialESIterator.class);
			pageContext.getOut().print(theContinent.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

