package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentNameOfficialENIterator theContinent = (ContinentNameOfficialENIterator)findAncestorWithClass(this, ContinentNameOfficialENIterator.class);
			pageContext.getOut().print(theContinent.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

