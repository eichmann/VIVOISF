package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryNameShortENIterator theCountry = (CountryNameShortENIterator)findAncestorWithClass(this, CountryNameShortENIterator.class);
			pageContext.getOut().print(theCountry.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

