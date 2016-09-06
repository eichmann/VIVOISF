package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryNameOfficialITIterator theCountry = (CountryNameOfficialITIterator)findAncestorWithClass(this, CountryNameOfficialITIterator.class);
			pageContext.getOut().print(theCountry.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

