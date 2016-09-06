package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryNameShortITIterator theCountry = (CountryNameShortITIterator)findAncestorWithClass(this, CountryNameShortITIterator.class);
			pageContext.getOut().print(theCountry.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

