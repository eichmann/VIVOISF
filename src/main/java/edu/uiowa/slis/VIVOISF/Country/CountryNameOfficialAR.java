package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryNameOfficialARIterator theCountry = (CountryNameOfficialARIterator)findAncestorWithClass(this, CountryNameOfficialARIterator.class);
			pageContext.getOut().print(theCountry.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

