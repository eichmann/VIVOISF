package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryNameOfficialESIterator theCountry = (CountryNameOfficialESIterator)findAncestorWithClass(this, CountryNameOfficialESIterator.class);
			pageContext.getOut().print(theCountry.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

