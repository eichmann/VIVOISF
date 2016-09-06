package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryNameOfficialZHIterator theCountry = (CountryNameOfficialZHIterator)findAncestorWithClass(this, CountryNameOfficialZHIterator.class);
			pageContext.getOut().print(theCountry.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

