package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryNameListENIterator theCountry = (CountryNameListENIterator)findAncestorWithClass(this, CountryNameListENIterator.class);
			pageContext.getOut().print(theCountry.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

