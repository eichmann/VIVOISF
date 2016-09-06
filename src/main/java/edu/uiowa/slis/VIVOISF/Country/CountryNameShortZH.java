package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryNameShortZHIterator theCountry = (CountryNameShortZHIterator)findAncestorWithClass(this, CountryNameShortZHIterator.class);
			pageContext.getOut().print(theCountry.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

