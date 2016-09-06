package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryNameOfficialENIterator theCountry = (CountryNameOfficialENIterator)findAncestorWithClass(this, CountryNameOfficialENIterator.class);
			pageContext.getOut().print(theCountry.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

