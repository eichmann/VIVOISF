package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentNameListENIterator theContinent = (ContinentNameListENIterator)findAncestorWithClass(this, ContinentNameListENIterator.class);
			pageContext.getOut().print(theContinent.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

