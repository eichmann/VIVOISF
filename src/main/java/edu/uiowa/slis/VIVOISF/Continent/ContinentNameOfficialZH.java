package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentNameOfficialZHIterator theContinent = (ContinentNameOfficialZHIterator)findAncestorWithClass(this, ContinentNameOfficialZHIterator.class);
			pageContext.getOut().print(theContinent.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

